# -*- coding: utf8 -*-

__author__ = "*"
__version__ = "Multi-interval"

from .dataset import *
from tqdm import tqdm
import random
from random import randint
import logging

logger = logging.getLogger()
from typing import Set, List

from copy import deepcopy

QUESTION_TOKEN_INDEX = 1
QUESTION_TOKEN_NAME = "@question"


class VocabReader(object):
    """read vocabulary file"""

    def __init__(self, filename, extra_tokens=[]):
        self.filename = filename
        self.extra_tokens = extra_tokens

    def read(self):
        vocab = Vocab()
        extra_size = len(self.extra_tokens) - 1
        index = 0
        for name in self.extra_tokens:
            vocab.append(name, index)

        with open(self.filename, mode="r", encoding="utf-8") as f:
            for line in f.readlines()[1:]:
                data = line.strip(' \r\n\t').split(',')
                index = int(data[0])
                if index > 0:
                    index += extra_size
                if len(data) > 1:
                    name = data[1]
                else:
                    name = ""
                    logger.info("Null index!")
                vocab.append(name, index)
                # vocab.append(name)
        return vocab


class DatasetReader(object):
    """read dataset file"""

    def __init__(self, corpus_path, path_index_path, token_path, node_index_path, subtoken_path,
                 shuffle_variable_indexes
                 , max_path_length, max_context_length, testFlag=False):

        self.path_vocab = VocabReader(path_index_path, extra_tokens=['<PAD/>']).read()
        logger.info('path vocab size: {0}'.format(self.path_vocab.len()))

        # self.terminal_vocab = VocabReader(terminal_index_path, extra_tokens=[QUESTION_TOKEN_NAME]).read()
        self.terminal_vocab = VocabReader(token_path, extra_tokens=['<PAD/>']).read()
        self.node_vocab = VocabReader(node_index_path, extra_tokens=['<PAD/>']).read()
        self.subtoken_vocab = VocabReader(subtoken_path, extra_tokens=['<PAD/>']).read()

        terminal_vocab_stoi = self.terminal_vocab.stoi
        self.variable_indexes = [terminal_vocab_stoi[term] for term in terminal_vocab_stoi if term.startswith("@var_")]
        logger.info('variable index size: {0}'.format(len(self.variable_indexes)))

        self.shuffle_variable_indexes = shuffle_variable_indexes
        self.label_vocab = Vocab()
        self.items = []
        self.last_item = None
        self.max_length = max_path_length
        self.max_context_length = max_context_length
        self.load(corpus_path, testFlag)
        logger.info('corpus: {0}'.format(len(self.items)))

    def load(self, corpus_path, test=False):
        with open(corpus_path, mode="r", encoding="utf-8") as f:
            context = f.readlines()
            logging.info("Reading data")
            for i, line in enumerate(tqdm(context)):
                line = line.strip(' \r\n\t')
                info = line.split(' ')
                info[0] = info[0].replace('\\', '/')
                fileInfo = info[0].split('/')
                if fileInfo[-1] == "buggy.java":
                    if not self.last_item is None and self.last_item.id is None:
                        self.items.pop()
                        # logging.error("Can get fixed file!")
                    code_data = CodeData()
                    code_data.location = "/".join(fileInfo[:-1])
                    if 'correct' in info[0]:
                        code_data.label = 0
                    elif 'overfitting' in info[0]:
                        code_data.label = 1  # overfitting file
                    else:
                        logging.error("Can get label!")
                    code_data.path_contexts = [tuple(map(int, x.split(','))) for x in info[1:]]
                    # code_data.path_contexts = self.pad_inputs(code_data.path_contexts, self.max_length//2)
                    self.items.append(deepcopy(code_data))
                elif fileInfo[-1] == "fixed.java":
                    if self.last_item.location == "/".join(fileInfo[:-1]):
                        self.last_item.location = i // 2
                        self.last_item.id = i // 2
                        # self.last_item.path_contexts += [tuple(map(int, x.split(','))) for x in info[1:]]
                        # self.last_item.path_contexts = self.pad_inputs(self.last_item.path_contexts, self.max_length)
                        buggy_context = self.last_item.path_contexts
                        fixed_context = [tuple(map(int, x.split(','))) for x in info[1:]]
                        intersection = set(buggy_context) & set(fixed_context)
                        buggy_sub_tree, fixed_sub_tree = self.find_ancestor(buggy_context, fixed_context)
                        buggy_res, fixed_res, tree_context = self.combine_and_pad_ver2(set(buggy_context), set(fixed_context),
                                                                    intersection, buggy_sub_tree,
                                                                    fixed_sub_tree)


                        if buggy_res[0] == 0 or fixed_res[0] == 0:
                            self.items.pop()
                            continue
                        self.last_item.path_contexts = buggy_res + fixed_res + tree_context
                    else:
                        logging.error("Can get fixed file!")
                        self.items.pop()
                self.last_item = self.items[-1]


    def find_ancestor(self, buggy_context: List, fixed_context: List):
        intersection = set(buggy_context) & set(fixed_context)
        buggy_paths = set(buggy_context) - intersection
        fixed_paths = set(fixed_context) - intersection
        if buggy_paths.__len__() == 0 and fixed_paths.__len__() == 0:
            return buggy_context, fixed_context
        min_index_buggy = int(1e5)
        max_index_buggy = 0
        min_index_fixed = int(1e5)
        max_index_fixed = 0
        index_buggy = {}
        index_fixed = {}
        for x in buggy_context:
            if x not in index_buggy:
                index_buggy[x] = index_buggy.__len__()
        for x in fixed_context:
            if x not in index_fixed:
                index_fixed[x] = index_fixed.__len__()
        for x in buggy_paths:
            min_index_buggy = min(min_index_buggy, index_buggy[x])
            max_index_buggy = max(min_index_buggy, index_buggy[x])
        for x in fixed_paths:
            min_index_fixed = min(min_index_fixed, index_fixed[x])
            max_index_fixed = max(min_index_fixed, index_fixed[x])
        preorder_buggy = buggy_context[:min_index_buggy]
        preorder_fixed = fixed_context[:min_index_fixed]
        possible_ancestor = set(preorder_buggy) & set(preorder_fixed)
        min_ancestor_b = int(1e5)
        min_ancestor_f = int(1e5)
        for x in possible_ancestor:
            min_ancestor_b = min(min_ancestor_b, index_buggy[x])
            min_ancestor_f = min(min_ancestor_f, index_fixed[x])

        if min_ancestor_b == int(1e5):
            min_ancestor_b = min_index_buggy
        if min_ancestor_f == int(1e5):
            min_ancestor_f = min_index_fixed
        buggy_sub_tree = buggy_context[min_ancestor_b: max_index_buggy]
        fixed_sub_tree = fixed_context[min_ancestor_f: max_index_fixed]
        return buggy_sub_tree, fixed_sub_tree


    def combine_and_pad(self, buggy_content: Set, fixed_content: Set, intersection: Set, max_length: int, clean_buggy=None, clean_fixed=None):
        if clean_buggy is None and clean_fixed is None:
            clean_buggy = buggy_content - intersection
            clean_fixed = fixed_content - intersection
        if clean_buggy.__len__() > clean_fixed.__len__():
            addition_length = max_length - clean_buggy.__len__()
        else:
            addition_length = max_length - clean_fixed.__len__()
        buggy_res = list(clean_buggy) + list(intersection)[:addition_length]
        fixed_res = list(clean_fixed) + list(intersection)[:addition_length]
        if buggy_res.__len__() == 0:
            buggy_res = list(intersection)
        elif fixed_res.__len__() == 0:
            fixed_res = list(intersection)

        buggy_res = self.pad_inputs(buggy_res, max_length)
        fixed_res = self.pad_inputs(fixed_res, max_length)
        return buggy_res, fixed_res

    def combine_and_pad_ver2(self, buggy_content: Set, fixed_content: Set, intersection: Set, clean_buggy=None, clean_fixed=None):
        if clean_buggy is None and clean_fixed is None:
            clean_buggy = buggy_content - intersection
            clean_fixed = fixed_content - intersection

        buggy_res = list(clean_buggy)
        fixed_res = list(clean_fixed)
        if buggy_res.__len__() == 0:
            buggy_res = list(intersection)
        elif fixed_res.__len__() == 0:
            fixed_res = list(intersection)

        buggy_res = self.pad_inputs(buggy_res, self.max_length)
        fixed_res = self.pad_inputs(fixed_res, self.max_length)
        context = self.pad_inputs(list(intersection), self.max_context_length)
        return buggy_res, fixed_res, context
 
    def pad_inputs(self, data, length, pad_value=0):
        """pad values"""

        if len(data) > length:
            data = data[:length]
        assert len(data) <= length
        count = length - len(data)
        if data.__len__() == 0:
            data.extend([(pad_value,pad_value,pad_value)] * count)
        elif isinstance(data[0], list):
            data.extend([[pad_value] * data[0].__len__() for i in range(count)])
        elif isinstance(data[0], tuple):
            data.extend([tuple([pad_value] * data[0].__len__()) for i in range(count)])
        else:
            data.extend([pad_value] * count)
        return data.copy()
