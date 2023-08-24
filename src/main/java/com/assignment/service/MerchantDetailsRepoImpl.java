package com.assignment.service;

import com.assignment.constants.Constants;
import com.assignment.model.merchant.Merchant;
import com.assignment.model.request.MerchantRequest;
import com.assignment.model.response.MerchantResponse;
import com.assignment.model.response.Control;
import com.assignment.model.response.Data;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MerchantDetailsRepoImpl implements MerchantDetailsRepo {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    MerchantService merchantService;

    public MerchantResponse merchantDetails(MerchantRequest payload) {

        Gson gson = new Gson();
        List<Merchant> merchants = new ArrayList<Merchant>();
        long lStartTime = System.currentTimeMillis();
        String sResponseMessage = "";
        int sResponseCode = 0;

        try {

            LOGGER.info("Fetching Merchant details...");
            if (!(payload.getMerchantId()==null || payload.getMerchantId().isEmpty())) {
                Merchant merchant = merchantService.getMerchantById(payload.getMerchantId());
                if(!(merchant == null)) merchants.add(merchant);
            } else {
                merchants = merchantService.getMerchants();
            }
            LOGGER.info("Merchant details fetched successfully.");

            sResponseCode = Constants.SUCCESS;
            sResponseMessage = Constants.SUCCESS_MSG;

        } catch (RuntimeException e) {
            LOGGER.error("Exception while processing Merchant Details : ", e);
            sResponseCode = Constants.FAILURE;
            sResponseMessage = Constants.FAILURE_MSG;
        }

        return MerchantResponse.builder()
                .control(Control.builder()
                        .timeTaken(String.valueOf(System.currentTimeMillis() - lStartTime))
                        .responseCode(sResponseCode)
                        .responseMessage(sResponseMessage)
                        .build())
                .data(Data.builder()
                        .merchant(merchants)
                        .build())
                .build();
    }
}
