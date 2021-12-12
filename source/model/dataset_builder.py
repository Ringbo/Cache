# -*- coding: utf8 -*-

__author__ = "*"

import torch
import random
import logging
from model.utils import get_subtokens
from tqdm import tqdm
from model.dataset import *
import threading
import gc
import multiprocessing
from psutil import virtual_memory

logger = logging.getLogger()
logging.getLogger().setLevel(logging.INFO)


class DatasetBuilder(object):
    """transform dataset for training and test"""

    def __init__(self, reader, option, split_ratio=0.1, shuffle=True, seed=None, fragment=0):
        self.reader = reader
        self.option = option
        self.terminal_length = option.terminal_length
        self.node_length = option.node_length
        # self.lock = threading.Lock()
        self.lock = multiprocessing.RLock()
        self.subtokenMapping = self.getTokenMapping()
        if split_ratio>0 and split_ratio <= 1:
            test_count = int(len(reader.items) * split_ratio)
        elif split_ratio > 1:
            test_count = split_ratio
        else:
            test_count = None

        if seed is not None:
            random.seed(seed)
        if shuffle:
            random.shuffle(reader.items)
        # else:
        #     random.shuffle(reader.items[0:len(reader.items)-test_count])

        if split_ratio>0 and split_ratio <= 1:
            train_items = reader.items[0:fragment*test_count] + reader.items[(fragment+1)*test_count:]
            test_items = reader.items[fragment*test_count:(fragment+1)*test_count]
            if abs((fragment+1)*test_count - reader.items.__len__()) < test_count:
                test_items = reader.items[fragment * test_count:]
        elif split_ratio > 1:
            train_items = reader.items[0:len(reader.items) - test_count]
            test_items = reader.items[-test_count:]
        logger.info('train item size: {0}'.format(len(train_items)))
        logger.info('test item size: {0}'.format(len(test_items)))
        cnt = 0
        train_dataset_size = 0
        test_dataset_size = 0
        train_dataset_size += len(train_items)
        test_dataset_size += len(test_items)

        logger.info('train dataset size: {0}'.format(train_dataset_size))
        logger.info('test dataset size: {0}'.format(test_dataset_size))

        self.train_items = train_items
        self.test_items = test_items
        self.train_dataset = None
        self.test_dataset = None

    def _filter_variable_aliases(self, aliases):
        return [alias_name for alias_name in aliases if alias_name.startswith("@var_")]

    def init_train_dataset(self, num_workers=8):

        inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label, inputs_paths_length, inputs_location, raw_paths \
            = self.build_data(
            self.reader,
            self.train_items,
            self.option.max_path_length, self.option.max_context_length, num_workers=num_workers)
        del self.train_items
        gc.collect()
        self.train_dataset = CodeDataset(inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label,
                                         inputs_paths_length, inputs_location, raw_paths)


    def refresh_train_dataset(self):
        self.train_dataset.refresh()

    def init_test_dataset(self, num_workers=1):
        """refresh test dataset (shuffling path contexts and picking up items (#items <= max_path_length)"""
        inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label, inputs_paths_length, inputs_location, raw_paths \
            = self.build_data(
            self.reader,
            self.test_items,
            self.option.max_path_length, self.option.max_context_length,num_workers=num_workers)

        self.test_items = ""
        del self.test_items
        gc.collect()
        self.test_dataset = CodeDataset(inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label,
                                        inputs_paths_length, inputs_location, raw_paths)

    def refresh_test_dataset(self):
        self.test_dataset.refresh()

    def _get_labels(self, option, reader, normalized_label):
        if option.eval_method == 'exact':
            return [normalized_label]
        else:
            label_index = reader.label_vocab.stoi[normalized_label]
            subtokens = reader.label_vocab.itosubtokens[label_index]
            return subtokens

    def _out_of_vocabulary_rate(self, option, reader, train_items, test_items):
        train_vocab = set()

        tokens_match = 0
        tokens_count = 0
        if self.reader.infer_method:
            for item in train_items:
                tokens = self._get_labels(option, reader, item.normalized_label)
                for token in tokens:
                    train_vocab.add(token)

        if self.reader.infer_variable:
            for item in train_items:
                alias_names = self._filter_variable_aliases(item.aliases)
                alias_indexes = [reader.terminal_vocab.stoi[alias_name] for alias_name in alias_names]

                for alias_name, var_token_index in zip(alias_names, alias_indexes):
                    normalized_var_name = item.aliases[alias_name]
                    tokens = self._get_labels(option, reader, normalized_var_name)
                    for token in tokens:
                        train_vocab.add(token)

        if self.reader.infer_method:
            for item in test_items:
                tokens = self._get_labels(option, reader, item.normalized_label)
                tokens_match += len([token for token in tokens if token in train_vocab])
                tokens_count += len(tokens)

        if self.reader.infer_variable:
            for item in test_items:
                alias_names = self._filter_variable_aliases(item.aliases)
                alias_indexes = [reader.terminal_vocab.stoi[alias_name] for alias_name in alias_names]

                for alias_name, var_token_index in zip(alias_names, alias_indexes):
                    normalized_var_name = item.aliases[alias_name]
                    tokens = self._get_labels(option, reader, normalized_var_name)
                    tokens_match += len([token for token in tokens if token in train_vocab])
                    tokens_count += len(tokens)
        return 1.0 - tokens_match / tokens_count

    def getTokenMapping(self):
        logger.info("Building subtoken dictionary.")
        mapping = {}
        mapping['<PAD/>'] = ['<PAD/>']
        for s in tqdm(self.reader.terminal_vocab.stoi):
            mapping[s] = get_subtokens(Vocab.normalize_method_name(s))
            if mapping[s].__len__() == 0:
                mapping[s].append(s)
        return mapping

    def build_data(self, reader, items, max_path_length, max_context_length, num_workers):
        inputs_id = []
        inputs_location = []
        inputs_starts = []
        inputs_paths = []
        inputs_paths_length = []
        inputs_ends = []
        inputs_label = []
        raw_paths = []
        logger.info("Building data")

        for i, item in enumerate(tqdm(items)):
            starts = []
            paths = []
            ends = []
            paths_length = []
            label_index = item.label
            for start, path, end in item.path_contexts:
                startStr = reader.terminal_vocab.itos[start]
                # startTokens = get_subtokens(Vocab.normalize_method_name(startStr))
                startTokens = self.subtokenMapping[startStr]
                if startTokens.__len__() == 0:
                    continue
                start = self.tokens2index(startTokens, reader.subtoken_vocab.stoi)
                starts.append(self.pad_inputs(start, self.terminal_length))
                pathStr = reader.path_vocab.itos[path]
                if pathStr == '<PAD/>':
                    path = [0]
                else:
                    path = list(map(int, pathStr.split(' ')))
                if path.__len__() > self.node_length:
                    paths_length.append(self.node_length)
                else:
                    paths_length.append(path.__len__())
                paths.append(self.pad_inputs(path, self.node_length, pad_value=0))

                endStr = reader.terminal_vocab.itos[end]
                # endTokens = get_subtokens(Vocab.normalize_method_name(endStr))
                endTokens = self.subtokenMapping[endStr]
                end = self.tokens2index(endTokens, reader.subtoken_vocab.stoi)
                if endTokens.__len__() == 0:
                    continue
                ends.append(self.pad_inputs(end, self.terminal_length))
            if starts.__len__() == 0 or ends.__len__() == 0:
                continue
            paths_length = self.pad_inputs(paths_length, 2*max_path_length+max_context_length, pad_value=1)
            raw_path = self.pad_inputs(item.path_contexts[:max_path_length], max_path_length)

            inputs_starts.append(starts)
            inputs_paths.append(paths)
            inputs_ends.append(ends)
            inputs_paths_length.append(paths_length)
            inputs_label.append(label_index)
            inputs_id.append(item.id)
            raw_paths.append(raw_path)
            inputs_location.append(item.location)

        inputs_starts = torch.tensor(inputs_starts, dtype=torch.long)  
        inputs_paths = torch.tensor(inputs_paths, dtype=torch.long)
        inputs_ends = torch.tensor(inputs_ends, dtype=torch.long)
        inputs_label = torch.tensor(inputs_label, dtype=torch.long)
        inputs_paths_length = torch.tensor(inputs_paths_length, dtype=torch.long)
        raw_paths = torch.tensor(raw_paths, dtype=torch.long)
        inputs_location = torch.tensor(inputs_location, dtype=torch.long)
        return inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label, inputs_paths_length, inputs_location, \
               raw_paths

    def build_data_test(self, reader, items, max_path_length, num_workers):
        inputs_id = multiprocessing.Manager().list()
        inputs_location = multiprocessing.Manager().list()
        inputs_starts = multiprocessing.Manager().list()
        inputs_paths = multiprocessing.Manager().list()
        inputs_paths_length = multiprocessing.Manager().list()
        inputs_ends = multiprocessing.Manager().list()
        inputs_label = multiprocessing.Manager().list()
        raw_paths = multiprocessing.Manager().list()
        logger.info("Building data")
        pool = multiprocessing.Pool(num_workers)
        for i, item in enumerate(tqdm(items)):
            args = (reader, max_path_length, item, inputs_starts, inputs_paths, inputs_ends,
                    inputs_paths_length, inputs_label, inputs_id, raw_paths, inputs_location)
            pool.apply_async(self.build_data_core, args)

        pool.close()
        pool.join()
        inputs_starts = torch.tensor(inputs_starts, dtype=torch.long)
        print(inputs_starts)
        inputs_paths = torch.tensor(inputs_paths, dtype=torch.long)  
        inputs_ends = torch.tensor(inputs_ends, dtype=torch.long)
        inputs_label = torch.tensor(inputs_label, dtype=torch.long)
        inputs_paths_length = torch.tensor(inputs_paths_length, dtype=torch.long)
        raw_paths = torch.tensor(raw_paths, dtype=torch.long)
        inputs_location = torch.tensor(inputs_location, dtype=torch.long)
        return inputs_id, inputs_starts, inputs_paths, inputs_ends, inputs_label, inputs_paths_length, inputs_location, \
               raw_paths

    def build_data_core(self, reader, max_path_length, item, inputs_starts, inputs_paths, inputs_ends,
                        inputs_paths_length, inputs_label, inputs_id, raw_paths, inputs_location):
        starts = []
        paths = []
        ends = []
        paths_length = []
        label_index = item.label
        for start, path, end in item.path_contexts[:max_path_length]:
            startStr = reader.terminal_vocab.itos[start]
            startTokens = get_subtokens(Vocab.normalize_method_name(startStr))
            if startTokens.__len__() == 0:
                continue
            start = self.tokens2index(startTokens, reader.subtoken_vocab.stoi)
            starts.append(self.pad_inputs(start, self.terminal_length))
            pathStr = reader.path_vocab.itos[path]
            if pathStr == '<PAD/>':
                path = [0]
            else:
                path = list(map(int, pathStr.split(' ')))
            if path.__len__() > self.node_length:
                paths_length.append(self.node_length)
            else:
                paths_length.append(path.__len__())
            paths.append(self.pad_inputs(path, self.node_length, pad_value=0))

            endStr = reader.terminal_vocab.itos[end]
            endTokens = get_subtokens(Vocab.normalize_method_name(endStr))
            end = self.tokens2index(endTokens, reader.subtoken_vocab.stoi)
            if endTokens.__len__() == 0:
                continue
            ends.append(self.pad_inputs(end, self.terminal_length))
        if starts.__len__() == 0:
            return
        starts = self.pad_inputs(starts, max_path_length)
        paths = self.pad_inputs(paths, max_path_length, pad_value=0)
        ends = self.pad_inputs(ends, max_path_length)
        paths_length = self.pad_inputs(paths_length, max_path_length, pad_value=1)
        raw_path = self.pad_inputs(item.path_contexts[:max_path_length], max_path_length)

        self.lock.acquire()
        inputs_starts.append(starts)
        inputs_paths.append(paths)
        inputs_ends.append(ends)
        inputs_paths_length.append(paths_length)
        inputs_label.append(label_index)
        inputs_id.append(item.id)
        raw_paths.append(raw_path)
        inputs_location.append(item.location)
        self.lock.release()

    def pad_inputs(self, data, length, pad_value=0):
        """pad values"""

        if len(data) > length:
            data = data[:length]
        assert len(data) <= length
        count = length - len(data)
        if data.__len__() == 0:
            data.extend([pad_value] * count)
        elif isinstance(data[0], list):
            data.extend([[pad_value] * data[0].__len__() for i in range(count)])
        elif isinstance(data[0], tuple):
            data.extend([tuple([pad_value] * data[0].__len__()) for i in range(count)])
        else:
            data.extend([pad_value] * count)
        return data.copy()

    def tokens2index(self, tokens, mapping):
        res = []
        for i, token in enumerate(tokens):
            if token in mapping:
                res.append(mapping[token])
        return res

    def nodes2index(self, path):
        return list(map(int, path.split(' ')))
