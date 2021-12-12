import re

adds = []
rems = []
contexts = []
stripAllRegex = re.compile('[\s]+')
import os
import fnmatch
import logging
from tqdm import tqdm


def getContext(buggyLine, buggyFile):
    head = "public class test {"
    tail = "}"
    medium = buggyLine - 1
    length = buggyFile.__len__()
    begin = 0
    i = medium
    leftBracket = 0
    rightBracket = 0
    if buggyFile[0] == '<html>\n' or i >= buggyFile.__len__():
        return ''
    while i > 0:
        curLine = buggyFile[i].strip()
        leftBracket += curLine.count('{')
        rightBracket += curLine.count('}')
        if re.search("(public|protected|private|static) .*\((.*)", curLine):
            begin = i
            i -= 1
            break
        elif re.search("(public|protected|private|static|final) class .* {", curLine):
            return ''
        else:
            i -= 1
    i = medium + 1
    continueFlag = False
    endLine = 0
    while i < buggyFile.__len__():
        curLine = buggyFile[i].strip()
        leftBracket += curLine.count('{')
        rightBracket += curLine.count('}')
        if curLine.startswith('}') or curLine.endswith('}'):
            continueFlag = True
            endLine = i
        elif curLine != '':
            continueFlag = False
        elif curLine.startswith('private') or curLine.startswith('public') or curLine.startswith(
                'protected') or i + 1 == length:
            break
        if leftBracket == rightBracket:
            endLine = i
            break
        i += 1
    context = removeAnnotation(buggyFile[begin:endLine + 1])
    context = ''.join(context)
    context = stripAllRegex.sub(' ', context).strip()
    return head + context + tail


def removeAnnotation(context):
    for i, x in enumerate(context):
        x = x.strip()
        if r'//' in x:
            context[i] = x[:x.find(r'//')]
        elif x.startswith('/*') or x.startswith('*') or x.startswith('*/'):
            context[i] = ''
    return context


def travFolder(dir, files=[]):
    global i
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.java'
        if os.path.isfile(os.path.join(dir, f)) and fnmatch.fnmatch(f, pattern):
            files.append(os.path.join(dir, f))
        elif os.path.isdir(os.path.join(dir, f)):
            travFolder(dir + '/' + f, files)
    return files


def readFile(file):
    with open(file, 'r', encoding='utf8') as f:
        return f.readlines()


def saveFile(path, data):
    if not os.path.exists(os.path.dirname(path)):
        os.makedirs(os.path.dirname(path))
    with open(path, 'w', encoding='utf8') as f:
        f.write(data)


def getFirstDiffLine(file1, file2):
    for i in range(min(file1.__len__(), file2.__len__())):
        curLine1 = stripAllRegex.sub(' ', file1[i].strip())
        curLine2 = stripAllRegex.sub(' ', file2[i].strip())
        if curLine1 != curLine2:
            return i


def getLastDiffLine(file1, file2):
    for i in range(1, min(file1.__len__(), file2.__len__()) + 1):
        curLine1 = stripAllRegex.sub(' ', file1[-i].strip())
        curLine2 = stripAllRegex.sub(' ', file2[-i].strip())
        if curLine1 != curLine2:
            return min(file1.__len__(), file2.__len__()) - i


def getPatchName(dir, index):
    if "/" in dir:
        fileInfo = dir.split('/')
    elif "\\" in dir:
        fileInfo = dir.split('\\')
    if 'ICSE' in dir:
        return '-'.join(fileInfo[-5:] + [str(index)])
    else:
        return '-'.join(fileInfo[-6:])

patchMapping = {'Patches_ICSE-Doverfitting-ACS-Math-93-1': 376, 'Patches_ICSE-Dcorrect-ACS-Math-35-1': 52,
                'Patches_ICSE-Dcorrect-AVATAR-Closure-38-1': 245}


def main(dataDir, outputDir):
    allFiles = travFolder(dataDir)
    allDirs = list(set(os.path.dirname(x) for x in allFiles))
    location = []
    for dir in tqdm(allDirs):
        num = os.listdir(dir).__len__() // 3
        for i in range(1, num + 1):
            if 'Dcorrect' in dir or 'Dsame' in dir:  # compare with buggy
                curBuggy = readFile(os.path.join(dir, 'buggy' + str(i) + '.java'))
                curFixed = readFile(os.path.join(dir, 'tool-patch' + str(i) + '.java'))
            elif 'Doverfitting' in dir:  # compare with dev-patch
                # curBuggy = readFile(os.path.join(dir, 'tool-patch' + str(i) + '.java'))
                # curFixed = readFile(os.path.join(dir, 'developer-patch' + str(i) + '.java'))
                curBuggy = readFile(os.path.join(dir, 'buggy' + str(i) + '.java'))
                curFixed = readFile(os.path.join(dir, 'tool-patch' + str(i) + '.java'))
            else:
                logging.error("Get files failed")
            patchName = getPatchName(dir, i)
            if patchName in patchMapping:
                diffLine = patchMapping[patchName]
            else:
                tmpBuggy = readFile(os.path.join(dir, 'buggy' + str(i) + '.java'))
                tmpFixed = readFile(os.path.join(dir, 'tool-patch' + str(i) + '.java'))
                diffLine = getLastDiffLine(tmpBuggy, tmpFixed)
            buggyMethod = getContext(diffLine + 1, curBuggy)
            fixedMethod = getContext(diffLine + 1, curFixed)
            if buggyMethod.__len__() == 0 or fixedMethod.__len__() == 0:
                logging.error("Get buggy mothod failed!")
                buggyMethod = getContext(diffLine + 1, curBuggy)
            location.append([str(location.__len__()), patchName])
            if 'Dcorrect' in dir or 'Dsame' in dir:
                saveFile(os.path.join(outputDir, 'correct/' + str(location[-1][0]) + '/buggy.java'), buggyMethod)
                saveFile(os.path.join(outputDir, 'correct/' + str(location[-1][0]) + '/fixed.java'), fixedMethod)
            elif 'Doverfitting' in dir:
                saveFile(os.path.join(outputDir, 'overfitting/' + str(location[-1][0]) + '/buggy.java'), buggyMethod)
                saveFile(os.path.join(outputDir, 'overfitting/' + str(location[-1][0]) + '/fixed.java'), fixedMethod)

    saveFile(os.path.join(outputDir, 'location.txt'), '\n'.join([','.join(x) for x in location]))


if __name__ == '__main__':
    main('./testDataset/Patches', './testDataset/Files_all')
