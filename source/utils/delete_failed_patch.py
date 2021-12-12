import os
import fnmatch
import shutil

def travFolder(dir, files=[], suffix=''):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.' + suffix if suffix != '' else '*.*'
        if os.path.isfile(os.path.join(dir, f)) and fnmatch.fnmatch(f, pattern):
            files.append(os.path.join(dir, f))
        elif os.path.isdir(os.path.join(dir, f)):
            travFolder(dir + '/' + f, files,suffix)
    return files


def parse_info(patch_file: str):
    info = os.path.basename(os.path.dirname(patch_file)).replace('\\', '/').split('-')
    if info.__len__() == 2:
        info.insert(0, info[0])
    info[2] = int(info[2]) if info[2] !='' else 0
    tool, project, bug_id = info
    apr = os.path.basename(os.path.dirname(os.path.dirname(patch_file)))
    patch_id = int(os.path.basename(patch_file).split('.')[0])
    return apr, tool, project, bug_id, patch_id


def changeMapping(patch:str):
    apr, tool, project, bug_id, patch_id = parse_info(patch)
    method_out_path = method_path + '/' + tool + '/' + '_'.join([tool, project, str(bug_id)]) + '/' + apr + '_' + str(patch_id)
    return method_out_path

if __name__ == '__main__':
    patch_path = "C:/Users/Ringbo/PycharmProjects/Torch-gpu/patchJudger/patches/Large/overfitting"
    method_path = "C:/Users/Ringbo/PycharmProjects/Torch-gpu/patchJudger/materials/Large/overfitting"
    patches_file = travFolder(patch_path, [], 'txt')
    all_method = travFolder(method_path, [])
    all_method = set([os.path.dirname(x) for x in all_method])
    allPatched = []
    cnt = 0
    cnt2 = 0
    for patch in patches_file:
        cur_method_path = changeMapping(patch)
        if os.path.exists(cur_method_path):
            allPatched.append(cur_method_path)
            cnt += 1
        else:
            cnt2 += 1
            os.remove(patch)
