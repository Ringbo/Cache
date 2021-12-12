# -*- coding: utf8 -*-

from model.modules.attention import LocalAttention
__author__ = "*"

import torch
import torch.nn as nn

from torch.nn.parameter import Parameter
import torch.nn.functional as F
import math
from model.utils import to_var, get_subtokens
import numpy as np

NINF = - 3.4 * math.pow(10, 38)  # -Inf

class binaryClassfier(nn.Module):
    def __init__(self, option):
        super(binaryClassfier, self).__init__()
        self.option = option
        self.terminal_embedding = nn.Embedding(option.terminal_count, option.terminal_embed_size, padding_idx=0)
        self.path_embedding = nn.Embedding(option.node_count, option.path_embed_size)
        # encoder's output

        self.attention_parameter = Parameter(torch.nn.init.xavier_normal_(
            torch.zeros(option.encode_size, 1, dtype=torch.float32, requires_grad=True)).view(-1), requires_grad=True)
        self.encode_size = option.encode_size
        self.terminal_embed_size = option.terminal_embed_size
        self.emb_size = option.terminal_embed_size * 2 + option.path_embed_size  # embed layer input size
        self.hidden_size = option.hidden_size
        self.answer_seq_len = 1
        self.path_embed_size = option.path_embed_size
        self.path_rnn_size = option.path_rnn_size

        self.dec = nn.LSTMCell(self.emb_size,
                               option.hidden_size)  # LSTMCell's input is always batch first
        self.path_rnn = nn.LSTM(
            option.path_embed_size, option.path_rnn_size // 2,
            num_layers=option.rnn_num_layers, batch_first=True, dropout=option.rnn_dropout,
            bidirectional=True)  # path encoder.
       
        self.input_linear = nn.Linear(option.terminal_embed_size * 2 + option.path_rnn_size, option.encode_size,
                                      bias=True)
     
        self.input_layer_norm = nn.LayerNorm(option.encode_size)
        if 0.0 < option.dropout_prob < 1.0:
            self.input_dropout = nn.Dropout(p=option.dropout_prob)
        else:
            self.input_dropout = None
            self.out_dropout = None

        self.selfAttention = LocalAttention(option.encode_size)
        self.selfAttention2 = LocalAttention(option.encode_size)
        encode_size = 8*self.encode_size + 1
        activate = torch.nn.ReLU()
        # activate = torch.nn.Tanh( )
        self.dropout_rnn = nn.Dropout(option.rnn_dropout)
        layers = [nn.Linear(encode_size, option.hidden_size), activate]
        for _ in range(option.n_hidden_layers - 1):
            layers += [nn.Linear(option.hidden_size, option.hidden_size), activate]
        self.hidden_layers = nn.Sequential(*layers)
        self.output_linear = nn.Linear(option.hidden_size, 2, bias=True)
        self.biLiner = nn.Bilinear(option.encode_size*2, option.encode_size*2, option.encode_size*2)


    def forward(self, starts, paths, ends, path_length):
        start_mask = (starts > 0).float()
        end_mask = (ends > 0).float()
        context_mask = (path_length > 1).float()
        batch, max_e, terminal_subword_size = starts.size()
        embed_element_start = self.terminal_embedding(
            starts.view(batch, -1)).view(batch, max_e, terminal_subword_size,
                                         self.terminal_embed_size)
        embed_fasttext_start = torch.sum(
            embed_element_start * start_mask.unsqueeze(-1), 2)

        embed_element_end = self.terminal_embedding(
            ends.view(batch, -1)).view(batch, max_e, terminal_subword_size,
                                       self.terminal_embed_size)
        embed_fasttext_end = torch.sum(
            embed_element_end * end_mask.unsqueeze(-1), 2)

        _, _, path_size = paths.size()

        rnn_version = 2

        if rnn_version == 1:
            # elements are out-of-order
            embed_element_path = self.path_embedding(
                paths.view(batch, -1)).view(batch * max_e, path_size,
                                            self.path_embed_size)
            ordered_len, ordered_idx = path_length.view(
                batch * max_e, ).sort(0, descending=True)
            embed_element_path_packed = nn.utils.rnn.pack_padded_sequence(
                    embed_element_path, ordered_len, batch_first=True)
            _, (hn, cn) = self.path_rnn(
                embed_element_path_packed)
            rnn_embed_path = torch.index_select(
                hn.view(batch * max_e, self.path_rnn_size), 0, ordered_idx).view(batch, max_e, self.path_rnn_size)

        elif rnn_version == 2:
            # elements are in oreder
            embed_element_path = self.path_embedding(
                paths.view(batch, -1)).view(batch * max_e, path_size,
                                            self.path_embed_size)
            packed_path_types = nn.utils.rnn.pack_padded_sequence(embed_element_path, path_length.view(batch * max_e), enforce_sorted=False, batch_first=True)

            _, (h_t, _) = self.path_rnn(packed_path_types)
            encoded_paths = h_t[-2:].transpose(0, 1).reshape(h_t.shape[1], -1)
            rnn_embed_path = self.dropout_rnn(encoded_paths).view(batch, max_e, self.path_rnn_size)
        combined_context_vectors = torch.cat(
            (embed_fasttext_start, rnn_embed_path, embed_fasttext_end), dim=2)
        combined_context_vectors = self.input_linear(
            combined_context_vectors.view(batch * max_e, -1)). \
            view(batch, max_e, -1)

        ccv_size = combined_context_vectors.size()
        combined_context_vectors = self.input_layer_norm(
            combined_context_vectors.view(-1, self.encode_size)).view(ccv_size)
        combined_context_vectors = torch.tanh(combined_context_vectors)
        # dropout
        if self.input_dropout is not None:
            combined_context_vectors = self.input_dropout(combined_context_vectors)

        # attention = self.get_attention(combined_context_vectors, context_mask)
        # expanded_attn = attention.unsqueeze(-1).expand_as(combined_context_vectors)

        #test
        attention = self.selfAttention(combined_context_vectors, context_mask)
        expanded_attn = attention.expand_as(combined_context_vectors)
        code_vector = torch.mul(combined_context_vectors, expanded_attn)  # with attention
        # code_vector = combined_context_vectors #  No-attention
        context = torch.sum(code_vector[:, -self.option.max_context_length:], dim=1)
        buggy_vector = torch.sum(code_vector[:, : self.option.max_path_length], dim=1)
        fixed_vector = torch.sum(code_vector[:, self.option.max_path_length: (self.option.max_path_length*2)], dim=1)
        buggy_vector = torch.cat((buggy_vector, context), dim=1)
        fixed_vector = torch.cat((fixed_vector, context), dim=1)

        # code_vector = torch.sum(torch.mul(combined_context_vectors, expanded_attn), dim=1)
        subtraction = fixed_vector - buggy_vector
        mul = torch.mul(fixed_vector, buggy_vector)
        sum = torch.add(buggy_vector,fixed_vector)
        cos = torch.cosine_similarity(fixed_vector, buggy_vector)
        BiTrans = self.biLiner(buggy_vector, fixed_vector)
        # finalVec = torch.cat((subtraction, sum, mul, cos.view(-1,1)), dim=1)
        finalVec = torch.cat((subtraction, sum, mul, BiTrans, cos.view(-1, 1)), dim=1)
        hidden = self.hidden_layers(finalVec)
        # if self.output_dropout is not None:
        #     hidden = self.output_dropout(hidden)
        outputs = self.output_linear(hidden)
        return outputs
