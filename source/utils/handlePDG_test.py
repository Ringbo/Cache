import re

# nodeFinder = re.compile("\[\d+\] [\x21-\x5a\x5c-\x7e \r\na-zA-Z{}]*")
stripAllRegex = re.compile('[\s]+')
nodeFinder = re.compile("\(\[\[\d+\] |, \[\d+\] ")
edgesFinder = re.compile("\), CD=\(|\[CD=\(|\), FD=\(|\[FD=\(")
numFinder = re.compile(",\[\d+\] ")
INF = 1e9
from grakel.kernels import SubgraphMatching, Propagation, LovaszTheta, HadamardCode, PyramidMatch, WeisfeilerLehman, \
    VertexHistogram, EdgeHistogram, GraphHopper, SvmTheta, RandomWalk, RandomWalkLabeled, ShortestPathAttr, \
    ShortestPath, Kernel
from grakel import Graph


class Graph_pair():
    def __init__(self):
        self.id = None
        self.patch_name = None
        self.buggy_graph = None
        self.fixd_graph = None
        self.similarity = None

    def cal_similarity(self):
        gk = WeisfeilerLehman(n_iter=2, normalize=True, base_graph_kernel=VertexHistogram)
        gk.fit([self.buggy_graph])
        similar = gk.transform([self.fixd_graph])
        self.similarity = similar[0][0]
        return self.similarity


def handleString(resStr):
    nodes = {}
    node_labels = {}
    edges = []
    resStr = resStr.strip()[:-3]  # remove ending string ")])"
    filePath, resStr = resStr.split(' | ', 1)
    ID = filePath.split()
    index_0 = resStr.find('], [CD=(')
    index_1 = resStr.find('], [FD=(')
    index = min(index_0 if index_0 != -1 else INF, index_1 if index_1 != -1 else INF)
    part1 = resStr[:index]
    part2 = resStr[index + 2:]
    tmp_PDG = list(set(stripAllRegex.sub(' ', x.strip()) for x in nodeFinder.split(part1) if x.strip() != ''))
    tmp_PDG.sort()
    # for x in set(stripAllRegex.sub(' ', x.strip()) for x in nodeFinder.split(part1) if x.strip() != ''):
    for x in tmp_PDG:
        nodes[x] = nodes.__len__()
        node_labels[nodes[x]] = x
    edges_raw = [stripAllRegex.sub(' ', x.strip()) for x in edgesFinder.split(part2) if x.strip() != '']
    for edge in edges_raw:
        curRelation = [stripAllRegex.sub(' ', x.strip()) for x in numFinder.split(edge) if x.strip() != '']
        curRelation[0] = re.sub("\[\d+\] ", '', curRelation[0], 1)
        if curRelation.__len__() != 2:
            print("Error happened in", filePath)
        edges.append((nodes[curRelation[0]], nodes[curRelation[1]]))
    return Graph(edges, node_labels=node_labels)


def getFileID(filePath):
    if "/" in filePath:
        fileInfo = filePath.split('/')
    elif "\\" in filePath:
        fileInfo = filePath.split('\\')
    return int(fileInfo[-2])


def calGraphDis(graph_1, graph_2):
    # gk = WeisfeilerLehman(n_iter=2, normalize=True, base_graph_kernel=VertexHistogram)
    # gk = HadamardCode(n_iter=2, normalize=True, base_graph_kernel=VertexHistogram)
    gk = PyramidMatch(normalize=True, verbose=False)
    # gk = SubgraphMatching()
    # gk = RandomWalkLabeled(normalize=True, verbose=True)
    # gk = ShortestPath(normalize=True)
    # gk = LovaszTheta()
    gk.fit([graph_1])
    # gk.fit_transform([graph_1])
    similar = gk.transform([graph_2])
    print(similar[0])


def getLocationMapping(locationPath):
    mapping = {}
    with open(locationPath, 'r', encoding='utf8') as f:
        tmp = f.readlines()
        for x in tmp:
            x = x.split(',')
            mapping[int(x[0])] = x[1].strip()
    return mapping


def tranpose(matrix):
    maxLen = 0
    for x in matrix:
        maxLen = max(maxLen, x.__len__())
    for i, x in enumerate(matrix):
        matrix[i].extend([','] * (maxLen - x.__len__()))
    return list(zip(*matrix))


def main(buggy, fixed):
    with open(buggy, 'r') as f:
        buggy = f.read()
    with open(fixed, 'r') as f:
        fixed = f.read()
    buggy_PDG = handleString(buggy)
    fixed_PDG = handleString(fixed)
    calGraphDis(buggy_PDG, fixed_PDG)


if __name__ == '__main__':
    main('./lib/res/PDG_b.txt', './lib/res/PDG_f.txt')
