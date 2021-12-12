import os

class vocab():
    def __init__(self, listElement):
        self.stoi = {}
        self.itos = {}
        self.itoi = {}  # from past to current.
        self.raw = listElement
        for x in listElement:
            index, data = x.strip().split(',')
            index = int(index)
            self.stoi[data] = index
            self.itos[index] = data

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


def main(template, child, paths_path, output_dir):
    paths_res = []
    with open(template, 'r') as f:
        nodes = vocab(f.readlines()[1:])
    with open(child, 'r') as f:
        nodes_2 = vocab(f.readlines()[1:])
    nodes.combine(nodes_2.stoi)
    with open(paths_path, 'r') as f:
        paths = vocab(f.readlines()[1:])
    for path in paths.raw:
        info = path.strip().split(',')
        curRes = []
        curNodes = list(map(int, info[1].split(' ')))
        for node in curNodes:
            curRes.append(str(nodes.convert(node)))
        paths_res.append(info[0] + ',' + " ".join(curRes) + '\n')
    with open(os.path.join(output_dir, 'paths_mapped.csv'), 'w', encoding='utf8') as f:
        f.write('id,path\n')
        f.writelines(paths_res)
    with open(os.path.join(output_dir, 'node_types_mapped.csv'), 'w', encoding='utf8') as f:
        f.write('id,node_type\n')
        for i in nodes.itos:
            f.write(str(i) + ',' + nodes.itos[i] + '\n')


if __name__ == '__main__':
    main('./dataset/java_diff/node_types.csv', './testDataset/node_types.csv', './testDataset/paths.csv', './testDataset')


