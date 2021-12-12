# -*- coding: utf8 -*-

__author__ = "*"

from torch.utils.data import Dataset

import re
import logging
import random
import torch
import numpy as np
logger = logging.getLogger()


class CodeDataset(Dataset):
    """dataset for training/test"""

    def __init__(self, ids, starts, paths, ends, labels, paths_length, inputs_location, raw_paths, transform=None):
        self.ids = ids
        self.starts = starts
        self.paths = paths
        self.ends = ends
        self.labels = labels
        self.transform = transform
        self.paths_length = paths_length
        self.paths_locations = inputs_location
        self.labels_indicator = np.zeros(paths.size()[0:2], dtype=np.bool_)
        self.raw_paths = raw_paths
        for i, label in enumerate(labels):
            self.labels_indicator[i][label] = True

    def __len__(self):
        return len(self.starts)

    def __getitem__(self, index):
        item = {
            'id': self.ids[index],
            'starts': self.starts[index],
            'paths': self.paths[index],
            'ends': self.ends[index],
            'label': self.labels[index],
            'paths_length': self.paths_length[index],
            'locations': self.paths_locations[index],
            'raw_paths': self.raw_paths[index]
        }
        if self.transform:
            item = self.transform(item)
        return item

    def refresh(self):
        randnum = random.randint(1, 1e8)
        maxPathLength = self.starts.size(1)
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.starts.numpy()[:, : maxPathLength//2]))
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.starts.numpy()[:, maxPathLength//2:]))

        np.random.seed(randnum)
        list(map(np.random.shuffle, self.paths.numpy()[:, : maxPathLength//2]))
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.paths.numpy()[:, maxPathLength//2:]))

        np.random.seed(randnum)
        list(map(np.random.shuffle, self.ends.numpy()[:, : maxPathLength//2]))
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.ends.numpy()[:, maxPathLength//2:]))

        np.random.seed(randnum)
        list(map(np.random.shuffle, self.paths_length.numpy()[:, : maxPathLength//2]))
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.paths_length.numpy()[:, maxPathLength//2:]))

        np.random.seed(randnum)
        list(map(np.random.shuffle, self.raw_paths.numpy()[:, : maxPathLength//2]))
        np.random.seed(randnum)
        list(map(np.random.shuffle, self.raw_paths.numpy()[:, maxPathLength//2:]))

        # np.random.seed(randnum)
        # list(map(np.random.shuffle, self.labels_indicator))
        # self.labels = torch.from_numpy(np.where(self.labels_indicator == True)[1])

class CodeData(object):
    """data corresponding to one method"""

    def __init__(self):
        self.id = None
        self.label = None
        self.label_converted = None
        self.label_index = -1
        self.normalized_label = None
        self.path_contexts = []
        self.contexts = []
        self.source = None
        self.aliases = {}
        self.location = None


class context(object):
    """data corresponding to one context"""

    def __init__(self):
        self.raw_context = None
        self.converted_context = None

class Vocab(object):
    """vocabulary (terminal symbols or path names or label(method names))"""

    REDUNDANT_SYMBOL_CHARS = re.compile(r"[_0-9]+")
    METHOD_SUBTOKEN_SEPARATOR = re.compile(r"([a-z]+)([A-Z][a-z]+)|([A-Z][a-z]+)")

    def __init__(self):
        self.stoi = {}
        self.itos = {}
        self.itosubtokens = {}
        self.freq = {}

    def append(self, name, index=None, subtokens=None):
        if name not in self.stoi:
            if index is None:
                index = len(self.stoi)
            if self.freq.get(index) is None:
                self.freq[index] = 0
            self.stoi[name] = index
            self.itos[index] = name
            if subtokens is not None:
                self.itosubtokens[index] = subtokens
            self.freq[index] += 1


    def get_freq_list(self):
        freq = self.freq
        freq_list = [0] * self.len()
        for i in range(self.len()):
            freq_list[i] = freq[i]
        return freq_list

    def len(self):
        return len(self.stoi)

    @staticmethod
    def normalize_method_name(method_name):
        return Vocab.REDUNDANT_SYMBOL_CHARS.sub("", method_name)

    @staticmethod
    def get_method_subtokens(method_name):
        return [x.lower() for x in Vocab.METHOD_SUBTOKEN_SEPARATOR.split(method_name) if x is not None and x != '']
