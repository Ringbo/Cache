import torch
from torch.autograd import Variable
import re
from nltk.stem import PorterStemmer
import wordninja
def to_var(x):
    if torch.cuda.is_available():
        x = x.cuda()
    return Variable(x)


def getDict(file):
    result = {}
    with open(file, 'r', encoding='utf8') as f:
        data = f.readlines()
        for x in data:
            idx, info = x.split('\t')
            result[info.strip()] = idx
    return result


numPattern = re.compile(r'^[-+]?[-0-9]\d*\.\d*|[-+]?\.?[0-9]\d*$|[-+]?\.?[0-9][x]?[a-fA-F\d]*[Ll]?$')
METHOD_SUBTOKEN_SEPARATOR = re.compile(
    r"([a-z]+)([A-Z][a-z]+)|([A-Z][a-z]+)|[_.]([a-z]+)([A-Z][a-z]+)|[._]?([a-z]+)[0-9]*[._]*|[._]([A-Z][a-z]+)|[._]?([A-Z]+)([A-Z][a-z]*)[0-9]*[._]*|([a-z]+)[0-9]+|([a-z]+)([A-Z]+[a-z]*)|[._]([0-9]*)")


def is_number(num):
    result = numPattern.match(num)
    if result:
        return True
    else:
        return False


skipSet = {"<PAD/>", "<ADD/>", "<DEL/>", "<UPD/>"}


def get_subtokens(method_name):
    # return [method_name]  # No token splitting test
    if method_name in skipSet:
        return [method_name]
    # return [x.lower() for x in METHOD_SUBTOKEN_SEPARATOR.split(method_name) if
    #         x is not None and x != '' and x[0] != '.' and x[0] != '_' and not is_number(x)]
    stemmer = PorterStemmer()
    # return [stemmer.stem(x) for x in METHOD_SUBTOKEN_SEPARATOR.split(method_name) if
    #         x is not None and x != '' and x[0] != '.' and x[0] != '_' and not is_number(x)]
    return [stemmer.stem(x).lower() for x in wordninja.split(method_name) if not is_number(x)]
