
import os
from tqdm import tqdm
import fnmatch

def travFolder(dir, files=[], suffix=''):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.' + suffix if suffix != '' else '*.*'
        if os.path.isfile(os.path.join(dir, f)) and fnmatch.fnmatch(f, pattern):
            files.append(os.path.join(dir, f))
        elif os.path.isdir(os.path.join(dir, f)):
            travFolder(dir + '/' + f, files,suffix)
    return files


def main(path_contexts_path,model):
    def for_classes(path_contexts_path):
        location = []
        with open(path_contexts_path, 'r', encoding='utf8') as f:
            contexts = [x.split(' ')[0] for x in f.readlines()]
        for i, context in enumerate(tqdm(contexts)):
            if i%2!=0:
                continue
            context = context.replace('\\', '/')
            validFlag = 'correct' if 'correct' in context else 'overfitting'
            context = [x for x in context.split('/') if x != '']
            tag = "/".join([validFlag, context[-3],context[-2]])
            location.append(str(i//2) + ',' + tag + '\n')
        return location

    def for_patches(path_contexts_path):
        location = []
        all_patches = travFolder(path_contexts_path, [])
        for i, context in enumerate(all_patches):
            validFlag = 'correct' if 'correct' in context else 'overfitting'
            context = context.replace('\\', '/')
            context = [x for x in context.split('/') if x != '']
            tag = "/".join([validFlag, context[-1]])
            location.append(str(i) + ',' + tag + '\n')
        return location


    if model == 'classes':
        return for_classes(path_contexts_path)
    elif model == 'patches':
        return for_patches(path_contexts_path)
    else:
        raise ValueError('Invalid model')


if __name__ == '__main__':
    # model = 'patches'
    model = 'classes'
    # path_contexts_path = 'C:/Users/Ringbo/PycharmProjects/Torch-gpu/patchJudger/dataset/Small/maxw5/path_contexts.csv'
    path_contexts_path = 'C:/Users/Ringbo/PycharmProjects/Torch-gpu/patchJudger/dataset/Large/maxw3/path_contexts.csv'
    # path_contexts_path = 'C:/Users/Ringbo/PycharmProjects/Torch-gpu/patchJudger/materials/Large/'
    location = main(path_contexts_path, model)
    # print(location)
    with open(os.path.dirname(path_contexts_path) + '/location.txt', 'w', encoding='utf8') as f:
        f.writelines(location)