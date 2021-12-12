import re, os
from nltk.stem import PorterStemmer
from tqdm import tqdm
from utils.execCmd import execCmd
import wordninja
METHOD_SUBTOKEN_SEPARATOR = re.compile(
    r"([a-z]+)([A-Z][a-z]+)|([A-Z][a-z]+)|[_.]([a-z]+)([A-Z][a-z]+)|[._]?([a-z]+)[0-9]*[._]*|[._]([A-Z][a-z]+)|[._]?([A-Z]+)([A-Z][a-z]*)[0-9]*[._]*|([a-z]+)[0-9]+|([a-z]+)([A-Z]+[a-z]*)|[._]([0-9]*)")
# METHOD_SUBTOKEN_SEPARATOR = re.compile(r"([a-z]+)([A-Z][a-z]+)|([A-Z][a-z]+)|[_.]([a-z]+)([A-Z][a-z]+)|[._]?([a-z]+)[0-9]*[._]*|[._]([A-Z][a-z]+)|[._]?([A-Z]+)[0-9]*[._]*|([a-z]+)[0-9]+|([a-z]+)([A-Z]+[a-z]*)|[-_]([0-9]*)")

# METHOD_SUBTOKEN_SEPARATOR = re.compile(r"([a-z]+)([A-Z][a-z]+)|([A-Z][a-z]+)|([a-zA-Z]*)[0-9]*[_.]([a-zA-Z0-9]+)*")
numPattern = re.compile(r'^[-+]?[-0-9]\d*\.\d*|[-+]?\.?[0-9]\d*$|[-+]?\.?[0-9][x]?[a-fA-F\d]*[Ll]?$')


class vocab():
    def __init__(self, listElement):
        self.stoi = {}
        self.itos = {}
        self.itoi = {}  # from past to current.
        self.allSting = set()
        self.raw = listElement
        for x in listElement:
            index, data = x.strip().split(',')
            index = int(index)
            self.stoi[data] = index
            self.itos[index] = data
            self.allSting.add(data)

    def combine(self, mapping):
        for x in mapping:  # string to index
            if x not in self.stoi:
                index = self.stoi.__len__() + 1
                self.stoi[x] = index
                self.itos[index] = x
                self.itoi[mapping[x]] = index
            else:
                self.itoi[mapping[x]] = self.stoi[x]

    def convert(self, x):
        return self.itoi[x]


def get_subtokens(method_name):
    # return [x.lower() for x in METHOD_SUBTOKEN_SEPARATOR.split(method_name) if x is not None and x != '' and x[0] != '.' and x[0] != '_' and not is_number(x)]
    stemmer = PorterStemmer()
    # return [stemmer.stem(x).lower() for x in METHOD_SUBTOKEN_SEPARATOR.split(method_name) if
    #         x is not None and x != '' and x[0] != '.' and x[0] != '_' and not is_number(x)]
    # return [method_name]
    return [stemmer.stem(x).lower() for x in wordninja.split(method_name) if
            x is not None and x != '' and x[0] != '.' and x[0] != '_' and not is_number(x)]


def is_number(num):
    result = numPattern.match(num)
    # return False
    if result:
        return True
    else:
        return False


def genSubtoken(args):
    mapping = set()
    with open(args.tokens, 'r', encoding='utf8') as f:
        terminal_idxs = f.readlines()[1:]
        for terminal in tqdm(terminal_idxs):
            idx, terminal = terminal.strip().split(',')
            subtokens = get_subtokens(terminal)
            if subtokens is None:
                continue
            for token in subtokens:
                if token == 'errorundeployedc':
                    print('')
                if token not in mapping:
                    mapping.add(token)

    result = list(mapping)
    result.sort()
    with open(args.dataset_dir + '/' + 'subtoken_dict_stem.csv', 'w', encoding='utf8') as f:
        f.write('id,token\n ')
        for i, x in enumerate(result):
            f.write(str(i + 1) + ',' + x + '\n')

tags = set()

def genFiles(args, output_root_Dir, block_size, limited=0):
    head = "public class test {"
    tail = "}"
    with open(args.add_path, 'r', encoding='utf8') as f:
        adds = [x.strip() for x in f.readlines()]
    with open(args.rem_path, 'r', encoding='utf8') as f:
        rems = [x.strip() for x in f.readlines()]
    cnt = 0
    with open(args.raw_context_path, 'r', encoding='utf8') as f:
        for i, contextStr in enumerate(tqdm(f.readlines())):
            if limited and cnt + 1 > limited:
                break
            if 'public' in adds[i] or 'public' in rems[i]:
                continue

            addStr = adds[i]
            remStr = rems[i]
            tag = addStr +remStr
            if tag in tags:
                continue
            else:
                tags.add(tag)
            contextStr = re.sub('[\s]+', ' ', contextStr.strip())
            addStr = re.sub('[\s]+', ' ', addStr)
            remStr = re.sub('[\s]+', ' ', remStr)
            context_buggy = head + contextStr + tail
            context_fixed = head + contextStr.replace(remStr, addStr, 1) + tail
            outputDir = output_root_Dir + '/' + str(i // block_size) + '/' + str(i) + '/'
            if not os.path.exists(outputDir):
                os.makedirs(outputDir)
            with open(outputDir + 'buggy.java', 'w', encoding='utf8') as bf:
                bf.write(context_buggy)
            with open(outputDir + 'fixed.java', 'w', encoding='utf8') as ff:
                ff.write(context_fixed)
            cnt += 1

def genCorpus(input_dir, output_dir):
    cmd = ['java', '-Xms4g', '-Xmx32g', '-jar', './lib/astminer.jar', 'pathContexts', '--lang', 'java', '--project',
           input_dir, '--output', output_dir, '--maxH', '15', '--maxW', '3', '--maxContexts', '200',
           '--maxTokens', '50000', '--maxPaths', '50000']
    execCmd(cmd)
    # java -Xms2g -Xmx16g -jar ./lib/astminer.jar pathContexts --lang java --project ./materials --output ./dataset --maxH 15 --maxW 2 --maxContexts 200 --maxTokens 500 --maxPaths 500

def combineCorpus(part_1, part_2, output_dir):
    with open(os.path.join(part_1, 'tokens.csv'), 'r') as f:
        tokens = vocab(f.readlines()[1:])
    with open(os.path.join(part_1, 'paths.csv'), 'r') as f:
        paths = vocab(f.readlines()[1:])
    with open(os.path.join(part_1, 'node_types.csv'), 'r') as f:
        nodes = vocab(f.readlines()[1:])
    with open(os.path.join(part_1, 'path_contexts.csv'), 'r') as f:
        path_contexts = f.readlines()

    with open(os.path.join(part_2, 'tokens.csv'), 'r') as f:
        tokens_2 = vocab(f.readlines()[1:])
    with open(os.path.join(part_2, 'paths.csv'), 'r') as f:
        paths_2_raw = vocab(f.readlines()[1:])
    with open(os.path.join(part_2, 'node_types.csv'), 'r') as f:
        nodes_2 = vocab(f.readlines()[1:])
    with open(os.path.join(part_2, 'path_contexts.csv'), 'r') as f:
        path_contexts_2 = f.readlines()

    tokens.combine(tokens_2.stoi)
    nodes.combine(nodes_2.stoi)
    paths_2 = []
    for path in paths_2_raw.raw:
        info = path.strip().split(',')
        curRes = []
        curNodes = list(map(int, info[1].split(' ')))
        for node in curNodes:
            curRes.append(str(nodes.convert(node)))
        paths_2.append(info[0] + ',' + " ".join(curRes) + '\n')
    paths_2 = vocab(paths_2)
    paths.combine(paths_2.stoi)

    for context in tqdm(path_contexts_2):
        curRes = []
        info = context.strip().split()
        curRes.append(info[0])
        info = list(map(lambda x: x.split(','), info[1:]))
        for path in info[1:]:
            curPath = str(tokens.convert(int(path[0]))) + ',' + str(paths.convert(int(path[1]))) + ',' \
                      + str(tokens.convert(int(path[2])))
            curRes.append(curPath)
        path_contexts.append(" ".join(curRes) + '\n')

    for path in paths_2.raw:
        info = path.strip().split(',')
        curNodes = info[1]
        if curNodes not in paths.allSting:
            paths.raw.append(str(paths.convert(int(info[0]))) + ',' + curNodes + '\n')
    if not os.path.exists(output_dir):
        os.mkdir(output_dir)
    with open(os.path.join(output_dir, 'path_contexts.csv'), 'w', encoding='utf8') as f:
        f.writelines(path_contexts)
    with open(os.path.join(output_dir, 'paths.csv'), 'w', encoding='utf8') as f:
        f.write('id,path\n')
        f.writelines(paths.raw)
    with open(os.path.join(output_dir, 'node_types.csv'), 'w', encoding='utf8') as f:
        f.write('id,node_type\n')
        for i in nodes.itos:
            f.write(str(i)+','+nodes.itos[i] + '\n')
    with open(os.path.join(output_dir, 'tokens.csv'), 'w', encoding='utf8') as f:
        f.write('id,token\n')
        for i in tokens.itos:
            f.write(str(i)+','+tokens.itos[i] + '\n')


if __name__ == '__main__':
    import argparse

    parser = argparse.ArgumentParser()
    parser.add_argument('--dataset_dir', type=str, default="./dataset/Large/maxw3", help="the path of generated AST paths")
    parser.add_argument('--tokens', type=str, default="./dataset/Large/maxw3/tokens.csv", help="the path of token vocabulary")
    args = parser.parse_args()
    genSubtoken(args)