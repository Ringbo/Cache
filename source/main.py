# -*- coding: utf8 -*-
__author__ = "**"
__version__ = 1.1

import sys
import argparse
import torch
import gc
# from meliae import scanner
from torch.utils.data import DataLoader
from model.model import *
from model.dataset_builder import DatasetBuilder
from sklearn.metrics import precision_recall_fscore_support, accuracy_score
import numpy as np
import logging
import os
from sklearn import metrics
from psutil import virtual_memory
logging.getLogger().setLevel(logging.INFO)
logging.basicConfig(format='%(asctime)s,%(msecs)d %(levelname)-8s [%(filename)s:%(lineno)d] %(message)s',
                    datefmt='%d-%m-%Y:%H:%M:%S')


import argparse

parser = argparse.ArgumentParser()
PREDICT_MODEL = "binary"
parser.add_argument('--dataset_path', type=str, default="./testDataset/", help="dataset_path")
parser.add_argument('--batch_size', type=int, default=64, help="batch_size")
parser.add_argument('--terminal_embed_size', type=int, default=128, help="terminal_embed_size")
parser.add_argument('--path_embed_size', type=int, default=128, help="path_embed_size")
parser.add_argument('--encode_size', type=int, default=160, help="encode_size")
parser.add_argument('--hidden_size', type=int, default=256, help="hidden_size")
parser.add_argument('--weight_size', type=int, default=256, help="weight_size")
parser.add_argument('--path_rnn_size', type=int, default=128, help="hidden_size")
parser.add_argument('--max_path_length', type=int, default=100, help="max_path_length")
parser.add_argument('--max_context_length', type=int, default=160, help="max_context_length")
parser.add_argument("--terminal_length", type=int, default=5, help="length of terminal")
parser.add_argument('--node_length', type=int, default=16, help="node_length")
parser.add_argument('--model_path', type=str, default="./output/pathJudger.model", help="model_path")
parser.add_argument('--test_result_path', type=str, default=None, help="test_result_path")
parser.add_argument("--max_epoch", type=int, default=40, help="max_epoch")
parser.add_argument('--lr', type=float, default=0.0003, help="lr")
parser.add_argument('--beta_min', type=float, default=0.9, help="beta_min")
parser.add_argument('--beta_max', type=float, default=0.999, help="beta_max")
parser.add_argument('--weight_decay', type=float, default=1.31e-3, help="weight_decay")
parser.add_argument('--rnn_dropout', type=float, default=0.6, help="rnn_dropout")
parser.add_argument('--dropout_prob', type=float, default=0.46, help="dropout_prob")
parser.add_argument('--shuffle_variable_indexes', type=bool, default=True, help="shuffle_variable_indexes")
parser.add_argument("--find_hyperparams", action="store_true", default=False,
                    help="find optimal hyperparameters")
parser.add_argument("--no_cuda", action="store_true", default=False, help="no_cuda")
parser.add_argument("--gpu", type=str, default="cuda:0", help="gpu")

if PREDICT_MODEL == "binary":
    from model.dataset_reader_binary import DatasetReader
elif PREDICT_MODEL == "pointer":
    pass

args = parser.parse_args()
device = torch.device(args.gpu if not args.no_cuda and torch.cuda.is_available() else "cpu")

class Option(object):
    """configurations of the model"""

    def __init__(self, reader):
        device = torch.device(args.gpu if not args.no_cuda and torch.cuda.is_available() else "cpu")
        self.max_path_length = args.max_path_length
        self.max_context_length = args.max_context_length
        self.terminal_count = reader.subtoken_vocab.len() + 2
        # self.terminal_count = reader.terminal_vocab.len()
        self.path_count = reader.path_vocab.len()
        # self.label_count = reader.label_vocab.len()
        self.node_count = reader.node_vocab.len() + 2
        # self.node_count = 135

        self.terminal_embed_size = args.terminal_embed_size
        self.path_embed_size = args.path_embed_size
        self.encode_size = args.encode_size
        self.path_rnn_size = args.path_rnn_size
        self.weight_size = args.weight_size
        self.hidden_size = args.hidden_size
        self.rnn_dropout = args.rnn_dropout
        self.dropout_prob = args.dropout_prob
        self.batch_size = args.batch_size
        self.subtoken_path = args.dataset_path + "subtoken_dict_stem.csv"
        self.node_dict_path = args.dataset_path + "node_types.csv"
        self.node_length = args.node_length
        self.n_hidden_layers = 3
        self.terminal_length = args.terminal_length
        self.shuffle_variable_indexes = args.shuffle_variable_indexes
        self.use_bi_rnn = True
        self.rnn_num_layers = 1
        self.device = device


def train():
    reader = DatasetReader(args.dataset_path + "path_contexts.csv", args.dataset_path + "paths.csv",
                           args.dataset_path + "tokens.csv", args.dataset_path + "node_types.csv",
                           args.dataset_path + "subtoken_dict_stem.csv",
                           shuffle_variable_indexes=args.shuffle_variable_indexes,
                           max_path_length=args.max_path_length, max_context_length=args.max_context_length)
    option = Option(reader)
    builder = DatasetBuilder(reader, option, split_ratio=0.2)  # Items order be shuffled in here
    builder.init_train_dataset()
    builder.init_test_dataset()
    if option.shuffle_variable_indexes:
        builder.refresh_train_dataset()
    if PREDICT_MODEL == "binary":
        label_freq = torch.tensor([1] * 2, dtype=torch.float32).to(option.device)
    elif PREDICT_MODEL == "pointer":
        label_freq = torch.tensor([1] * args.max_path_length, dtype=torch.float32).to(device)
        label_freq[0] = torch.tensor(4)
    criterion = nn.NLLLoss(weight=1 / label_freq).to(option.device)
    if PREDICT_MODEL == "binary":
        model = binaryClassfier(option)
    elif PREDICT_MODEL == "pointer":
        model = classfier_pointer(option)
    if torch.cuda.device_count() > 1:
        print("Let's use", torch.cuda.device_count(), "GPUs!")
        model = nn.DataParallel(model)
    model = model.to(option.device)
    learning_rate = args.lr
    optimizer = torch.optim.Adam(model.parameters(), lr=learning_rate, betas=(args.beta_min, args.beta_max),
                                 weight_decay=args.weight_decay)
    gc.collect()
    _train(model, optimizer, criterion, option, builder, None)


def _train(model, optimizer, criterion, option, builder, trial):
    # del reader
    # gc.collect()
    best_f1 = 0
    for epoch in range(args.max_epoch):
        train_loss = 0.0
        train_data_loader = DataLoader(builder.train_dataset, batch_size=option.batch_size, shuffle=True,
                                       num_workers=4)
        if option.shuffle_variable_indexes:
            builder.refresh_train_dataset()
        model.train()
        for i_batch, sample_batched in enumerate(train_data_loader):
            starts = sample_batched['starts'].to(option.device)
            paths = sample_batched['paths'].to(option.device)
            ends = sample_batched['ends'].to(option.device)
            label = sample_batched['label'].to(option.device)
            paths_length = sample_batched['paths_length'].to(option.device)
            ids = sample_batched['id'].to(option.device)
            optimizer.zero_grad()
            preds = model.forward(starts, paths, ends, paths_length)
            _, preds_label = torch.max(preds, dim=1)
            loss = calculate_loss(preds, label, criterion)
            loss.backward()
            optimizer.step()
            train_loss += loss.item()
        if option.shuffle_variable_indexes:
            builder.refresh_test_dataset()
        test_data_loader = DataLoader(builder.test_dataset, batch_size=option.batch_size, shuffle=False,
                                      num_workers=4)
        test_loss, top1_accuracy, precision, recall, f1 = test(model, test_data_loader, criterion, option)
        log_result(epoch, train_loss, test_loss, top1_accuracy, precision, recall, f1)
        if trial is None and f1 > best_f1:
            best_f1 = f1
            if not os.path.exists(os.path.dirname(args.model_path)):
                os.mkdir(os.path.dirname(args.model_path))
            torch.save(model.state_dict(), args.model_path + '_' + str(epoch))
    return 1.0 - f1


def test(model, data_loader, criterion, option, k=1, printFlag=False):
    """test the model"""
    model.eval()
    with torch.no_grad():
        test_loss = 0.0
        expected_labels = []
        actual_labels = []
        acutal_locations = []
        allStarts = []
        for i_batch, sample_batched in enumerate(data_loader):
            starts = sample_batched['starts'].to(option.device)
            paths = sample_batched['paths'].to(option.device)
            ends = sample_batched['ends'].to(option.device)
            label = sample_batched['label'].to(option.device)
            paths_length = sample_batched['paths_length'].to(option.device)
            locations = sample_batched['locations'].to(option.device)
            acutal_locations.extend(locations)
            expected_labels.extend(label)
            preds = model.forward(starts, paths, ends, paths_length)
            loss = calculate_loss(preds, label, criterion)
            test_loss += loss.item()
            _, preds_label = torch.max(F.log_softmax(preds, dim=1), dim=1)
            actual_labels.extend(preds_label)
            allStarts.extend(starts)

        if k == 1 and PREDICT_MODEL == "binary":
            expected_labels = np.array(expected_labels)
            actual_labels = np.array(actual_labels)
            accuracy, precision, recall, f1 = exact_match(expected_labels, actual_labels)
        elif PREDICT_MODEL == "pointer":
            accuracy, precision, recall, f1, oracle_class, pred_class = match_classfication(allStarts, actual_labels, expected_labels)
        return test_loss, accuracy, precision, recall, f1


def exact_match(expected_labels, actual_labels):
    expected_labels = np.array(expected_labels, dtype=np.uint64)
    actual_labels = np.array(actual_labels, dtype=np.uint64)
    precision = metrics.precision_score(expected_labels, actual_labels)
    recall = metrics.recall_score(expected_labels, actual_labels)
    f1 = metrics.f1_score(expected_labels, actual_labels)
    accuracy = accuracy_score(expected_labels, actual_labels)
    return accuracy, precision, recall, f1


def match_classfication(starts, preds_label, oracle_label):
    cnt = 0
    tp = 0
    tn = 0
    correctTerminal = [0] * args.terminal_length
    correctTerminal[0] = 1
    allPredBuggy = 0
    allPredFixed = 0
    correctTerminal = torch.tensor(correctTerminal).to(device)
    oracle_class = []
    pred_class = []
    allBuggy = 0
    for i, pred in enumerate(preds_label):
        curTerminal = starts[i][pred]
        # if sum(curTerminal) == 0:
        #     print("")
        if curTerminal.equal(correctTerminal):
            truePredLabel = 0  # fixed
            allPredFixed += 1
        else:
            truePredLabel = 1  # overfitting
            allPredBuggy += 1

        curOracleTerminal = starts[i][oracle_label[i]]
        if curOracleTerminal.equal(correctTerminal):
            trueOracleLabel = 0
        else:
            trueOracleLabel = 1
            allBuggy += 1
        if trueOracleLabel == truePredLabel and trueOracleLabel == 0:  # true negative
            tn += 1
        elif trueOracleLabel == truePredLabel and trueOracleLabel == 1:  # true positive
            tp += 1
        pred_class.append(truePredLabel)
        oracle_class.append(trueOracleLabel)
    precision, recall, f1, _ = precision_recall_fscore_support(oracle_class, pred_class, average='binary')
    accuracy = accuracy_score(oracle_class, pred_class)

    print("all predicted fixed: ", allPredFixed, "all predicted buggy: ", allPredBuggy)
    print("all hit fixed: ", tn, "all hit buggy: ", tp)
    return accuracy, precision, recall, f1, oracle_class, pred_class


def calculate_loss(predictions, label, criterion):
    preds = F.log_softmax(predictions, dim=1)
    _, preds_label = torch.max(preds, dim=1)
    loss = criterion(preds, label)
    return loss


def find_optimal_hyperparams():
    pass


def log_result(epoch, train_loss, test_loss, accuracy, precision, recall, f1):
    logging.info("epoch {0}".format(epoch))
    logging.info('{{"metric": "train_loss", "value": {0}}}'.format(train_loss))
    logging.info('{{"metric": "test_loss", "value": {0}}}'.format(test_loss))
    logging.info('{{"metric": "accuracy", "value": {0}}}'.format(accuracy))
    logging.info('{{"metric": "precision", "value": {0}}}'.format(precision))
    logging.info('{{"metric": "recall", "value": {0}}}'.format(recall))
    logging.info('{{"metric": "f1", "value": {0}}}'.format(f1))


def main(args):
    logging.info("device: {0}".format(device))
    if args.find_hyperparams:
        find_optimal_hyperparams()
    else:
        train()


if __name__ == '__main__':
    main(args)
