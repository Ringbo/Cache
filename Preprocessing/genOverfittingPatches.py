import os
import fnmatch,re
from tqdm import tqdm
from unidiff import PatchSet
import javalang
import subprocess
from typing import Tuple, List
from collections import defaultdict
import shutil
import json
FNULL = open(os.devnull, 'w')

def travFolder(dir, files=[], suffix=''):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.' + suffix if suffix != '' else '*.*'
        if os.path.isfile(os.path.join(dir, f)) and fnmatch.fnmatch(f, pattern):
            files.append(os.path.join(dir, f))
        elif os.path.isdir(os.path.join(dir, f)):
            travFolder(dir + '/' + f, files,suffix)
    return files

# devNull = open(os.devnull, 'w')
def bugs_jar_mapping(benchmark_dir):
    data_dir = benchmark_dir + "/ID2commit"
    mapping = defaultdict(dict)
    repos = os.listdir(data_dir)
    for repo in repos:
        project = repo.split('.')[0]
        with open(os.path.join(data_dir,repo),'r',encoding='utf8') as f:
            for line in f.readlines():
                ID, commit = line.strip().split(',')
                mapping[project][int(ID)] = commit
    return mapping

def bears_mapping(benchmark_dir):
    data_dir = benchmark_dir + "../bug_id_and_branch.json"
    mapping = {}
    with open(data_dir,'r', encoding='utf8') as f:
        bugs = json.load(f)
    for bug in bugs:
        mapping[bug['bugId']] = bug['bugBranch']
    return mapping


def checkout(tool: str, project: str, bug_id: int, outputDir: str):
    tag = '_'.join([tool, project, str(bug_id)])
    if os.path.exists(os.path.join(outputDir, tag)):
        return True
    if not os.path.exists(outputDir):
        os.makedirs(outputDir)
    if tool.lower() == 'defects4j':
        subprocess.call(["defects4j", "checkout","-p",project,'-v',str(bug_id)+'b','-w','./' +outputDir+'/'+tag], encoding="utf-8",stdout = subprocess.PIPE,stderr = subprocess.STDOUT)
        # os.system('defects4j checkout -p ' + project + ' -v ' + str(bug_id) + 'b' + ' -w ./' +outputDir+'/'+tag)
    elif tool.lower() == 'bugs.jar':
        if project == 'math':
            repo_path = BUGS_JAR_PATH + 'commons-math'
        elif project == 'OAK':
            repo_path = BUGS_JAR_PATH + 'jackrabbit-oak'
        elif project == "log4j2":
            repo_path = BUGS_JAR_PATH + 'logging-log4j2'
        else:
            repo_path = BUGS_JAR_PATH + project
        branch_id = "bugs-dot-jar_" + bug_jar_ID_commit[project][bug_id]
        cmd = "cd " + repo_path + "; git reset .; git checkout -- .; git clean -x -d --force; git checkout master; git checkout " + branch_id
        subprocess.call(cmd, shell=True,stdout=FNULL, stderr=subprocess.STDOUT)
        shutil.copytree(repo_path, outputDir + '/' + tag)
    elif tool.lower() == 'bears':
        repo_path = BEARS_PATH
        branch_id = "%s-%s" % (project, bug_id)
        branch_id = Bear_ID_commit[branch_id]
        cmd = "cd " + repo_path + "; git reset .; git checkout -- .; git clean -x -d --force; git checkout -f master; git checkout -f " + branch_id
        subprocess.call(cmd, shell=True, stdout=FNULL, stderr=subprocess.STDOUT)
        shutil.copytree(repo_path, outputDir + '/' + tag)
    elif tool.lower() == 'quixbugs':
        repo_path = QUIXBUGS_PATH
        tag = os.path.join(tag, "src", "main", "java")
        shutil.copytree(repo_path, outputDir + '/' + tag)
    else:
        return False
    return True


def parse_info(patch_file: str):
    info = os.path.basename(os.path.dirname(patch_file)).replace('\\', '/').split('-')
    if info.__len__() == 2:
        info.insert(0, info[0])
    info[2] = int(info[2]) if info[2] !='' else 0
    tool, project, bug_id = info
    apr = os.path.basename(os.path.dirname(os.path.dirname(patch_file)))
    patch_id = int(os.path.basename(patch_file).split('.')[0])
    return apr, tool, project, bug_id, patch_id

path_mapping = {}
def apply_patch(patch_path: str, project_path: str, output_dir: str):
    def get_original_file(project_path:str,patched_file:str):
        project_name = os.path.basename(project_path)
        if patched_file.endswith('java') and not patched_file.endswith('.java'):
            patched_file = patched_file[:-4] + '.java'
        dir_name = os.path.basename(os.path.dirname(patched_file.strip()))
        dir_name = 'java' if dir_name == '' else dir_name
        tag = project_name + '_' + dir_name +'_' + os.path.basename(patched_file.strip())
        if tag not in path_mapping:
            file_paths = travFolder(project_path,[],suffix='java')
            for file_path in file_paths:
                curTag =  project_name + '_' +os.path.basename(os.path.dirname(file_path))+'_'+os.path.basename(file_path)
                path_mapping[curTag] = file_path
        return path_mapping[tag]
        

    tmp_patch = './tmp.patch'
    with open(patch_path) as f:
        patch_str = f.read()
        patch = PatchSet(patch_str)
    failCnt = 0
    for i, patchedFile in enumerate(patch):
        with open(tmp_patch, "w") as f:
            f.write(patchedFile.__str__())
        # original_file = project_path + '/' + '/'.join([x for x in patchedFile.source_file.split('/') if x!=''][2:])
        original_file = get_original_file(project_path, patchedFile.source_file)
        convert2unix(original_file.strip())
        if not os.path.exists(output_dir):
            os.makedirs(output_dir)
        subprocess.run(["cp","-r",original_file, output_dir + '/buggy-' + str(i) + '.java'])
        subprocess.run(["cp","-r",original_file,original_file+'.bak'])
        try:
            patch_file(tmp_patch, original_file)
        except BaseException as e:
            # print(e)
            os.remove(tmp_patch)
            subprocess.run(["mv",original_file+'.bak',original_file])
            os.remove(output_dir + '/buggy-' + str(i) + '.java')
            failCnt += 1
            continue
        os.remove(tmp_patch)
        subprocess.run(["cp","-r",original_file, output_dir + '/tool-patch-' + str(i) + '.java'])
        subprocess.run(["mv",original_file+'.bak',original_file])
    if failCnt ==  patch.__len__():
        # os.rmdir(output_dir)
        os.system("rm -rf "+output_dir)
        # os.removedirs(output_dir)
        return False
    else:
        return True


def convert2unix(file_path: str) -> bool:
    command_result = subprocess.run(["dos2unix", file_path], encoding="utf-8",stdout = subprocess.PIPE,stderr = subprocess.STDOUT)
    if command_result.returncode != 0:
        raise RuntimeError(f"Convert {file_path} failed with error\n{command_result.stderr}")
    return True


def patch_file(patch: str, file_path: str) -> bool:
    command_result = subprocess.run(["patch", "-l", "-u", "--fuzz=15", "-i", patch, file_path],
                                    encoding="utf-8",stdout = subprocess.PIPE,stderr = subprocess.STDOUT)
    if command_result.returncode != 0:
        raise RuntimeError(f"Patch {file_path} failed with error\n{command_result.stderr},{command_result.stdout}")


def get_modified_methods(patch_path: str, class_dir: str):
    def annotate_unsupport_code(code: List[str]):
        for i, line in enumerate(code):
            if line.startswith("package ") or line.startswith("import "):
                code[i] = '//' + code[i]
        return code

    def get_ast(functions: List[str]):
        func = annotate_unsupport_code(functions)
        tokens = javalang.tokenizer.tokenize("".join(func))
        parser = javalang.parser.Parser(tokens)
        tree = parser.parse_member_declaration()
        return tree
    replaceString = re.compile("[\"].*?[\"]")
    def get_end_line(start_line: int, file_back: List[str],upper_limit:int):
        file = file_back.copy()
        left_bracket = 0
        right_bracket = 0
        for i in range(start_line, upper_limit):
            anno_index = file[i].find('//')
            file[i] = file[i][:anno_index] if anno_index != -1 else file[i]
            file[i] = replaceString.sub("",file[i]) ##
            left_bracket += file[i].count('{')
            right_bracket += file[i].count('}')
            if right_bracket == left_bracket and right_bracket:
                return i
        if right_bracket == left_bracket and right_bracket == 0:
            return start_line
        else:
            return -1
            # raise RuntimeError("Can't get function end\n")

    def get_function_positions(tree, class_file: List[str]):
        position = []  # start from 0
        methods = []
        for x in tree.body:
            if isinstance(x,javalang.tree.ClassDeclaration):
                for y in x.body:
                    if isinstance(y,javalang.tree.ClassDeclaration):
                        methods.extend(y.methods)
                    elif isinstance(y,javalang.tree.MethodDeclaration) or isinstance(y,javalang.tree.ConstructorDeclaration):
                        methods.append(y)
            elif isinstance(x,javalang.tree.MethodDeclaration) or isinstance(x,javalang.tree.ConstructorDeclaration):
                methods.append(x)
        if methods.__len__() == 0:
            methods.extend(tree.methods)
        for i, method in enumerate(methods):
            start_line = method.position.line - 1
            if i + 1< methods.__len__():
                upper_limit = methods[i+1].position.line - 1
            else:
                upper_limit = class_file.__len__() -1
            end_line = get_end_line(start_line, class_file,upper_limit)
            if end_line == -1:
                continue
            position.append((start_line, end_line))
        position = list(set(position))
        position.sort()
        return position

    with open(patch_path) as f:
        patch = PatchSet(f.read())
    buggy_methods = []
    patched_methods = []
    for i, patchedFile in enumerate(patch):  # different files
        source_start = []  # collect all star lines and find methods in class
        target_start = []
        for hunk in patchedFile:
            bias = -1
            target_start_2nd = -1
            source_start_2nd = -1
            curHunkCnt = [0,0]
            for j, x in enumerate(hunk):
                if x.line_type == '-':
                    source_start.append(x.source_line_no-1)
                    curHunkCnt[0] += 1
                elif x.line_type == '+':
                    target_start.append(x.target_line_no-1)
                    curHunkCnt[1] += 1
                elif sum(curHunkCnt) == 0:
                    if x.target_line_no is not None:
                        target_start_2nd = x.target_line_no-1
                    if x.source_line_no is not None:
                        source_start_2nd = x.source_line_no - 1
            if target_start.__len__() == 0 or curHunkCnt[1] == 0:
                target_start.append(target_start_2nd)
            elif source_start.__len__() == 0 or curHunkCnt[0] == 0:
                source_start.append(source_start_2nd)
        buggy_path = class_dir + '/buggy-' + str(i) + '.java'
        tool_path = class_dir + '/tool-patch-' + str(i) + '.java'
        if not (os.path.exists(buggy_path) and os.path.exists(tool_path)):
            continue
        with open(buggy_path,'r') as buggy_class, open(tool_path,'r') as patched_class:
            buggy_class = buggy_class.readlines()
            patched_class = patched_class.readlines()

        buggy_tree = get_ast(buggy_class)
        patched_tree = get_ast(patched_class)
        buggy_funtions_position = get_function_positions(buggy_tree, buggy_class)
        patched_funtions_position = get_function_positions(patched_tree, patched_class)
        buggy_methods_pos = set()
        patched_methods_pos = set()
        for start in source_start:
            for pos in buggy_funtions_position:
                if pos[0] <= start and start <= pos[1]:
                    buggy_methods_pos.add(pos)
                    break
        for start in target_start:
            for pos in patched_funtions_position:
                if pos[0] <= start and start <= pos[1]:
                    patched_methods_pos.add(pos)
        for x in buggy_methods_pos:
            buggy_methods.append("".join(buggy_class[x[0]:x[1]+1]))
        for x in patched_methods_pos:
            patched_methods.append("".join(patched_class[x[0]:x[1]+1]))
    return buggy_methods, patched_methods

def save_methods(buggy_methods:List[str], patched_methods:List[str],output_dir:str):
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)
    head = "public class test {\n"
    tail = "}"
    with open(output_dir+'/'+'buggy.java','w',encoding='utf8') as buggy_f, open(output_dir+'/'+'fixed.java','w',encoding='utf8') as patched_f:
        buggy_f.write(head+ "".join(buggy_methods) +tail)
        patched_f.write(head+ "".join(patched_methods) +tail)

cnt = 0
successful = 0
def main(patches_path: str,output_dir :str):
    global cnt
    global successful
    patches_file = travFolder(patches_path,[],'txt')
    temp_dir = './temp_projects'
    for patch in tqdm(patches_file):
        try:
            apr, tool, project, bug_id, patch_id = parse_info(patch)
            cnt += 1
            if not checkout(tool=tool, project=project, bug_id=bug_id, outputDir=temp_dir + '/' + tool):
                continue
            project_path = temp_dir+ '/' + tool + '/' + '_'.join([tool, project, str(bug_id)])
            project_out_path = output_dir + '/files'+ '/' + tool + '/' + '_'.join([tool, project, str(bug_id)]) + '/' + apr+'_'+str(patch_id)
            method_out_path = output_dir + '/methods'+ '/' + tool + '/' + '_'.join([tool, project, str(bug_id)]) + '/'+ apr+'_'+str(patch_id)
            if not apply_patch(patch, project_path,  project_out_path):
                print(patch)
                continue
            buggy_methods, patched_methods = get_modified_methods(patch, project_out_path)
            successful += 1
            save_methods(buggy_methods,patched_methods,method_out_path)
        except BaseException as e:
            print("Failed at ", patch,'with',e)

if __name__ == "__main__":
    BUGS_JAR_PATH = "/home/ringbo/APR/benchmark/Bug-dot-jar/"
    BEARS_PATH = "/home/ringbo/APR/benchmark/Bears/bears-benchmark/"
    QUIXBUGS_PATH = "/home/ringbo/APR/benchmark/QuixBugs/java_programs/"
    bug_jar_ID_commit = bugs_jar_mapping(BUGS_JAR_PATH)
    Bear_ID_commit = bears_mapping(BEARS_PATH)
    patches_path = 'patches/correct-deduplicated'
    # patches_path = 'test_patches'
    output_path = 'correct_D4j'
    main(patches_path,output_path)
    print(cnt)
    print(successful)
