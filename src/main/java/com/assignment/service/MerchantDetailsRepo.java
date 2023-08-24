package com.assignment.service;

import com.assignment.model.request.MerchantRequest;
import com.assignment.model.response.MerchantResponse;

public interface MerchantDetailsRepo {
    MerchantResponse merchantDetails(MerchantRequest payload);
}