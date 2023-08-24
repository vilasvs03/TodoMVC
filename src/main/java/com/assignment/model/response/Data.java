package com.assignment.model.response;

import com.assignment.model.merchant.Merchant;
import lombok.Builder;

import java.util.List;

@lombok.Data
@Builder
public class Data {
    private List<Merchant> merchant;
}