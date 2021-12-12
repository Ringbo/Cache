import re

# nodeFinder = re.compile("\[\d+\] [\x21-\x5a\x5c-\x7e \r\na-zA-Z{}]*")
stripAllRegex = re.compile('[\s]+')
nodeFinder = re.compile("\(\[\[\d+\] |, \[\d+\] ")
edgesFinder = re.compile("\), CD=\(|\[CD=\(|\), FD=\(|\[FD=\(")
numFinder = re.compile(",\[\d+\] ")
import json
INF = 1e9
from grakel.kernels import PropagationAttr, WeisfeilerLehman, VertexHistogram, PyramidMatch, RandomWalkLabeled
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
        # gk = PyramidMatch(normalize=True, verbose=True)
        # gk = RandomWalkLabeled(normalize=True, verbose=True)  # available
        if self.buggy_graph is None or self.fixd_graph is None:
            self.similarity = -1
            return -1
        gk.fit([self.buggy_graph])
        similar = gk.transform([self.fixd_graph])
        self.similarity = similar[0][0]
        return self.similarity


def handleString(resStr):
    nodes = {}
    node_labels = {}
    edges = []
    resStr = resStr.strip()  # remove ending string ")])"
    filePath, resStr = resStr.split(' | ', 1)
    DataFlowNodes = json.loads(resStr)['DataFlowNodes']
    for x in DataFlowNodes:
        nodes[x['name']] = nodes.__len__()
        node_labels[nodes[x['name']]] = x['name']
    for x in DataFlowNodes:
        if x['in'] != '':
            inEdges = x['in'].split(',')
            for edge in inEdges:
                edge = edge.split('->')
                edges.append((nodes[edge[0].strip()], nodes[edge[1].strip()]))
        if x['out'] != '':
            outEdges = x['out'].split(',')
            for edge in outEdges:
                edge = edge.split('->')
                edges.append((nodes[edge[0].strip()], nodes[edge[1].strip()]))

    edges = list(set(edges))
    if edges.__len__() == 0:
        return None
    return Graph(edges, node_labels=node_labels)


def getFileID(filePath):
    if "/" in filePath:
        fileInfo = filePath.split('/')
    elif "\\" in filePath:
        fileInfo = filePath.split('\\')
    return int(fileInfo[-2])


def calGraphDis(graph_1, graph_2):
    # gk = WeisfeilerLehman(n_iter=2, normalize=True, base_graph_kernel=VertexHistogram)
    # gk = PyramidMatch(normalize=True,verbose=True)  # available
    gk = RandomWalkLabeled(normalize=True, verbose=True)  # available
    gk.fit([graph_1])
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
        matrix[i].extend([',']*(maxLen-x.__len__()))
    return list(zip(*matrix))

def main(PDG_path, location_path, output_path):
    with open(PDG_path, 'r', encoding='utf8') as f:
        PDG_raw = f.readlines()
    # PDG_raw.sort(key=lambda x:int(x.split(' | ', 1)[0].split('\\')[-2]))

    # temp code
    # tmp = []
    # for x in PDG_raw:
    #     tmp.append(int(x.split(' | ', 1)[0].split('\\')[-2]))
    # tmp = list(set(tmp))
    # tmp.sort()
    # for i in range(943):
    #     if i not in tmp:
    #         print(i)
    # temp code end


    locations = getLocationMapping(location_path)
    graph_pairs = []
    res = []
    overfitting = []
    correct = []
    diffProjects_c = {'Chart': [], 'Time': [], 'Closure': [], 'Lang': [], 'Math': []}
    diffTechniques_c = {'H': [], 'C': [], 'T': [], 'L': []}
    diffProjects_o = {'Chart': [], 'Time': [], 'Closure': [], 'Lang': [], 'Math': []}
    diffTechniques_o = {'H': [], 'C': [], 'T': [], 'L': []}
    # H: Heuristic-based, C: Constraint-based, T: Template-based, L: Learning-based
    techMapping = {"jGenProg": 'H', "jKali": 'H', "jMutRepair": 'H', "SimFix": "H", "Arja": "H",
                   "GenProg": "H", "Kali": "H", "RSRepair": "H", "CapGen": "H", "DynaMoth": "C", "Nopol": "C",
                   "ACS": "C", "Cardumen": "C", "Jaid": "C", "SketchFix": "C", "kPAR": "T", "FixMiner": "T",
                   "AVATAR": "T", "TBar": "T", "SOFix": "T", "SequenceR": 'L'}

    cnt = 0
    for x in PDG_raw:
        filePath, _ = x.split(' | ', 1)
        if filePath.endswith('buggy.java'):
            graph_pair = Graph_pair()
            graph_pair.buggy_graph = handleString(x)
            graph_pair.id = getFileID(filePath)
            graph_pairs.append(graph_pair)
        elif filePath.endswith('fixed.java'):
            graph_pairs[-1].fixd_graph = handleString(x)
            try:
                print(locations[graph_pairs[-1].id], graph_pairs[-1].cal_similarity())
            except:
                continue
            res.append(str(locations[graph_pairs[-1].id]) + ',' + str(graph_pairs[-1].similarity))
            if graph_pairs[-1].similarity == -1:
                cnt+=1
                continue
            if 'overfitting' in locations[graph_pairs[-1].id]:
                overfitting.append(locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))
                patchInfo = locations[graph_pairs[-1].id].split('-')
                tool, project = patchInfo[-4:-2]
                if tool not in techMapping:
                    tool, project = patchInfo[-5:-3]
                tec = techMapping[tool]
                diffTechniques_o[tec].append(locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))
                diffProjects_o[project].append(locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))
            elif 'correct' in locations[graph_pairs[-1].id]:
                correct.append(locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))
                patchInfo = locations[graph_pairs[-1].id].split('-')
                tool, project = patchInfo[-4:-2]
                if tool not in techMapping:
                    tool, project = patchInfo[-5:-3]
                tec = techMapping[tool]
                diffTechniques_c[tec].append(
                    locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))
                diffProjects_c[project].append(
                    locations[graph_pairs[-1].id] + ',' + str(graph_pairs[-1].similarity))

    tmpRes = []
    for x in diffProjects_c:
        tmpRes.append(diffProjects_c[x])
        tmpRes.append(diffProjects_o[x])
    tmpRes = tranpose(tmpRes)
    with open(output_path, 'w', encoding='utf8') as f:
        tmpRes = [",".join(x)+'\n' for x in tmpRes]
        f.writelines(tmpRes)
    print(cnt)
    return graph_pairs


if __name__ == '__main__':
    main('./DFG/DFG.txt', './DFG/location.txt', './DFG/DFG_similarity.csv')
