from typing import Dict

import torch
from torch import nn

from utils.common import FROM_TOKEN, TO_TOKEN, PATH_TYPES


class PathEncoder(nn.Module):
    def __init__(self, option):
        super().__init__()
        self.type_pad_id = 0
        self.node_padding_idx = 0
        self.num_directions = 2 if option.use_bi_rnn else 1
        self.subtoken_embedding = nn.Embedding(option.terminal_count, option.terminal_embed_size,
                                               padding_idx=self.node_padding_idx)
        self.type_embedding = nn.Embedding(option.node_count, option.path_embed_size, padding_idx=self.type_pad_id)

        self.path_lstm = nn.LSTM(
            option.path_embed_size,
            option.path_rnn_size,
            num_layers=option.rnn_num_layers,
            bidirectional=option.use_bi_rnn,
            dropout=option.rnn_dropout if option.rnn_num_layers > 1 else 0,
        )
        self.dropout_rnn = nn.Dropout(option.rnn_dropout)

        concat_size = option.path_embed_size * 2 + option.path_rnn_size * self.num_directions
        self.linear = nn.Linear(concat_size, option.encode_size, bias=False)
        self.output_concat = nn.Dropout(option.dropout_prob)

    def forward(self, starts: torch.Tensor, paths: torch.Tensor, ends: torch.Tensor, ) -> torch.Tensor:
        # [max name parts; total paths]
        from_token = starts.view(-1, starts.size(-1)).transpose(0, 1)
        to_token = ends.view(-1, starts.size(-1)).transpose(0, 1)

        # [total paths; embedding size]
        encoded_from_tokens = self.subtoken_embedding(from_token).sum(0)  # combine each token's subtoken vector
        encoded_to_tokens = self.subtoken_embedding(to_token).sum(0)

        # [max path length; total paths]
        path_types = paths.view(-1, starts.size(-1)).transpose(0, 1)
        # [max path length; total paths; embedding size]
        path_types_embed = self.type_embedding(path_types)

        # create packed sequence (don't forget to set enforce sorted True for ONNX support)
        with torch.no_grad():
            path_lengths = (path_types != self.type_pad_id).sum(0)
        packed_path_types = nn.utils.rnn.pack_padded_sequence(path_types_embed, path_lengths, enforce_sorted=False)

        # [num layers * num directions; total paths; rnn size]
        _, (h_t, _) = self.path_lstm(packed_path_types)
        # [total_paths; rnn size * num directions]
        encoded_paths = h_t[-self.num_directions:].transpose(0, 1).reshape(h_t.shape[1], -1)
        encoded_paths = self.dropout_rnn(encoded_paths)

        # [total_paths; 2 * embedding size + rnn size (*2)]
        concat = torch.cat([encoded_from_tokens, encoded_paths, encoded_to_tokens], dim=-1)

        # [total_paths; output size]
        output = self.linear(concat)
        output = self.output_concat(output)
        return output
