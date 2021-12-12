import sys,re
from tqdm import tqdm
import os,javalang

replaceBlank = re.compile("[\s]+")
allContextSet = set()
def saveCleanDate(outputDir,curContext,curAdd,curRem):
    # curAdd = replaceBlank.sub(' ',curAdd.strip())
    # curRem = replaceBlank.sub(' ',curRem.strip())
    # curContext = replaceBlank.sub(' ',curContext.strip())
    if not os.path.exists(outputDir):
        os.mkdir(outputDir)
    with open(outputDir + 'add_clean.txt','a',encoding="utf8") as f:
        f.writelines([x + '\n' for x in curAdd])
    with open(outputDir + 'rem_clean.txt','a',encoding="utf8") as f:
        f.writelines([x + '\n' for x in curRem])
    with open(outputDir + 'context_clean.txt','a',encoding="utf8") as f:
        f.writelines([x + '\n' for x in curContext])

def level0_filter(curContext,curAdd,curRem):
    if '//' in curContext or '/*' in curContext:
        return True
    if curContext.__len__() > 5500 or curAdd == curRem or curAdd.__len__() == 0 or curRem.__len__() == 0:
        return True
    return False

def level1_filter(curContext,curAdd,curRem):
    if curContext not in allContextSet:
        allContextSet.add(curContext)
    else:
        return True
    return False

invalidChangeSet = {"<class 'javalang.tokenizer.DecimalInteger'>","<class 'javalang.tokenizer.String'>","DecimalFloatingPoint","HexInteger","<class 'javalang.tokenizer.String'>"}
def level2_filter(curContext,curAdd,curRem):
    try:
        addTokens = removeSeparator(list(javalang.tokenizer.tokenize(curAdd)))
        remTokens = removeSeparator(list(javalang.tokenizer.tokenize(curRem)))
    except:
        return True
    for i in range(min(addTokens.__len__(),remTokens.__len__())):
        addToken = addTokens[i]
        remToken = remTokens[i]
        if remToken.value != addToken.value and str(type(addToken)) in invalidChangeSet:
            return True
    return False
    
separator = {'(', ',', ')', '}', '{', '[', ']', '.', ';'}
def removeSeparator(tokens):
    result = []
    for x in tokens:
        if x.value not in separator:
            result.append(x)
    return result

def main(contextFile,addFile,remFile,thread_n,limit = 0):
    allAdd = []
    allRem = []
    allContext = []
    with open(addFile,'r',encoding="utf8") as f:
        additions = f.readlines()
    with open(remFile,'r',encoding="utf8") as f:
        removed = f.readlines()
    with open(contextFile,'r',encoding="utf8") as f:
        for i, curAdd in enumerate(tqdm(additions)):
            curContext = f.readline()
            curContext = replaceBlank.sub(' ',curContext.strip())
            curRem = replaceBlank.sub(' ',removed[i].strip())
            curAdd = replaceBlank.sub(' ',curAdd.strip())

            # if level0_filter(curContext,curAdd,curRem):
            #     continue
            if level1_filter(curContext,curAdd,curRem) or level2_filter(curContext,curAdd,curRem):
                continue
            
            allContext.append(curContext)
            allRem.append(curRem)
            allAdd.append(curAdd)
            if i and i%10000 == 0:
                saveCleanDate('./CleanData_level_2/',allContext,allAdd,allRem)
                allAdd.clear()
                allRem.clear()
                allContext.clear()


if __name__ == "__main__":
    context = sys.argv[1]
    add = sys.argv[2]
    rem = sys.argv[3]
    main(context,add,rem,10,0)