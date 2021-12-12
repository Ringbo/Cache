import torch
import os
from torch.utils.data import DataLoader
import numpy
from model.model import *
from main import log_result, match_classfication, calculate_loss, exact_match
from model.dataset_builder import *

class Option(object):
    """configurations of the model"""

    def __init__(self, reader):
        device = torch.device(args.gpu if not args.no_cuda and torch.cuda.is_available() else "cpu")
        self.max_path_length = args.max_path_length
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
        self.subtoken_path = args.subtoken_path
        self.node_dict_path = args.node_dict_path
        self.node_length = args.node_length
        self.n_hidden_layers = 2
        self.terminal_length = args.terminal_length
        self.shuffle_variable_indexes = args.shuffle_variable_indexes
        self.use_bi_rnn = True
        self.rnn_num_layers = 1
        self.device = device

def test():
    reader = DatasetReader(args.context_path, args.path_idx_path, args.tokens_path, args.node_dict_path,
                           args.subtoken_path, shuffle_variable_indexes=args.shuffle_variable_indexes,
                           max_path_length=args.max_path_length)
    option = Option(reader)
    builder = DatasetBuilder(reader, option, 1.0, shuffle=False)
    builder.init_test_dataset()
    builder.refresh_test_dataset()
    if PREDICT_MODEL == "binary":
        # model = binaryClassfier(option)
        model = binaryClassfier_test2(option)
    elif PREDICT_MODEL == "pointer":
        model = classfier_pointer(option)
    model = model.to(option.device)
    model.load_state_dict(torch.load(args.model_path))
    test_data_loader = DataLoader(builder.test_dataset, batch_size=option.batch_size, shuffle=False,
                                  num_workers=4)
    if PREDICT_MODEL == "binary":
        label_freq = torch.tensor([1] * 2, dtype=torch.float32).to(option.device)
    elif PREDICT_MODEL == "pointer":
        label_freq = torch.tensor([1] * args.max_path_length, dtype=torch.float32).to(device)
        label_freq[0] = torch.tensor(6)
    criterion = nn.NLLLoss(weight=1 / label_freq).to(option.device)
    test_loss, top1_accuracy, precision, recall, f1 = _test(model, test_data_loader, criterion, option)
    log_result(0, 0, test_loss, top1_accuracy, precision, recall, f1)


def _test(model, data_loader, criterion, option, k=1):
    """test the model"""
    model.eval()
    with torch.no_grad():
        test_loss = 0.0
        expected_labels = []
        actual_labels = []
        locations = []
        allStarts = []
        for i_batch, sample_batched in enumerate(data_loader):
            starts = sample_batched['starts'].to(option.device)
            paths = sample_batched['paths'].to(option.device)
            ends = sample_batched['ends'].to(option.device)
            label = sample_batched['label'].to(option.device)
            paths_length = sample_batched['paths_length'].to(option.device)
            locations.extend(sample_batched['locations'].to(option.device))
            expected_labels.extend(label)
            preds = model.forward(starts, paths, ends, paths_length)
            loss = calculate_loss(preds, label, criterion)
            test_loss += loss.item()
            preds = F.log_softmax(preds, dim=1)
            _, preds_label = torch.max(preds, dim=1)
            actual_labels.extend(preds_label)
            allStarts.extend(starts)

        if k == 1 and PREDICT_MODEL == "binary":
            expected_labels = np.array(expected_labels)
            actual_labels = np.array(actual_labels)
            accuracy, precision, recall, f1 = exact_match(expected_labels, actual_labels)
            saveResult(expected_labels, actual_labels, locations)
        elif PREDICT_MODEL == "pointer":
            accuracy, precision, recall, f1, oracle_class, pred_class = match_classfication(allStarts, actual_labels, expected_labels)
            saveResult(oracle_class, pred_class, locations)
            # accuracy, precision, recall, f1 = exact_match(expected_labels, actual_labels)
            # logging.info('{{"metric": "classification accuracy", "value": {0}}}'.format(accuracy_clas))
            # logging.info('{{"overfitting": {0}, "fixed: {1}"}}'.format(buggy, fixed))
        return test_loss, accuracy, precision, recall, f1


def saveResult(oracle_classes, pred_classes, locations):
    locMapping = {}
    with open(args.location_mapping, 'r', encoding='utf8') as f:
        tmp = [x.strip().split(',') for x in f.readlines()]
        for x in tmp:
            locMapping[int(x[0])] = x[1]

    res = []
    for i in range(oracle_classes.__len__()):
        curOracle = str(int(oracle_classes[i]))
        curPred = str(int(pred_classes[i]))
        res.append([int(locations[i]), curOracle, curPred, 'True' if curOracle == curPred else 'False'])
    res.sort()
    for i in range(res.__len__()):
        res[i][0] = locMapping[res[i][0]]
        res[i].append('overfitting') if 'overfitting' in res[i][0] else res[i].append('correct')
        res[i] = ','.join(res[i]) + '\n'

    with open(os.path.join(ROOT_PATH, 'predict_result.csv'), 'w', encoding='utf8') as f:
        f.write('Patch,oracle,predict,valid,classification\n')
        f.writelines(res)

def main():
    test()


if __name__ == '__main__':
    import argparse

    parser = argparse.ArgumentParser()
    ROOT_PATH = './testDataset/'
    # binary pointer. Note that when using binary model, we have to change 'refresh' in dataset
    PREDICT_MODEL = "binary"
    parser.add_argument('--context_path', type=str, default=ROOT_PATH + "path_contexts.csv", help="context_path")
    parser.add_argument('--path_idx_path', type=str, default=ROOT_PATH + "paths_mapped.csv", help="path_idx_path")
    parser.add_argument('--tokens_path', type=str, default=ROOT_PATH + "tokens.csv", help="tokens")
    parser.add_argument('--subtoken_path', type=str, default=ROOT_PATH + "subtoken_dict_stem.csv", help="subtokens")
    parser.add_argument('--node_dict_path', type=str, default=ROOT_PATH + "node_types_mapped.csv", help="node_dict_path")
    parser.add_argument('--location_mapping', type=str, default=ROOT_PATH + "location.txt", help="location_dict_path")
    parser.add_argument('--batch_size', type=int, default=128, help="batch_size")
    parser.add_argument('--terminal_embed_size', type=int, default=128, help="terminal_embed_size")
    parser.add_argument('--path_embed_size', type=int, default=128, help="path_embed_size")
    parser.add_argument('--encode_size', type=int, default=320, help="encode_size")
    parser.add_argument('--hidden_size', type=int, default=256, help="hidden_size")
    parser.add_argument('--weight_size', type=int, default=256, help="weight_size")
    parser.add_argument('--path_rnn_size', type=int, default=128, help="hidden_size")
    parser.add_argument('--rnn_dropout', type=float, default=0.5, help="rnn_dropout")
    parser.add_argument('--max_path_length', type=int, default=200, help="max_path_length")
    parser.add_argument("--terminal_length", type=int, default=5, help="length of terminal")
    parser.add_argument('--node_length', type=int, default=16, help="node_length")
    parser.add_argument('--model_path', type=str, default="./output/pathJudger.model_3", help="model_path")
    parser.add_argument('--test_result_path', type=str, default=None, help="test_result_path")
    parser.add_argument("--max_epoch", type=int, default=40, help="max_epoch")
    parser.add_argument('--lr', type=float, default=0.001, help="lr")
    parser.add_argument('--beta_min', type=float, default=0.9, help="beta_min")
    parser.add_argument('--beta_max', type=float, default=0.999, help="beta_max")
    parser.add_argument('--weight_decay', type=float, default=1.31e-3, help="weight_decay")
    parser.add_argument('--dropout_prob', type=float, default=0.25, help="dropout_prob")
    parser.add_argument('--shuffle_variable_indexes', type=bool, default=False, help="shuffle_variable_indexes")
    parser.add_argument("--find_hyperparams", action="store_true", default=False,
                        help="find optimal hyperparameters")
    parser.add_argument("--no_cuda", action="store_true", default=False, help="no_cuda")
    parser.add_argument("--gpu", type=str, default="cuda:0", help="gpu")

    if PREDICT_MODEL == "binary":
        from model.dataset_reader_binary import DatasetReader
    elif PREDICT_MODEL == "pointer":
        from model.dataset_reader_pointer import DatasetReader
    args = parser.parse_args()
    device = torch.device(args.gpu if not args.no_cuda and torch.cuda.is_available() else "cpu")
    main()
