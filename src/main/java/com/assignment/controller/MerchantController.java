package com.assignment.controller;

import com.assignment.model.request.MerchantRequest;
import com.assignment.model.response.MerchantResponse;
import com.assignment.service.MerchantDetailsRepo;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping(value = "api/assignment")
public class MerchantController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    Gson gson = new Gson();

    @Autowired
    private MerchantDetailsRepo merchantDetails;

    @PostMapping(value = "/merchant/merchantDetails")
    public ResponseEntity<Object> merchantDetails(@RequestBody MerchantRequest payload) {

        LOGGER.info("Request Received : " + gson.toJson(payload));
        MerchantResponse result = merchantDetails.merchantDetails(payload);
        LOGGER.info("Response sent : " + gson.toJson(result));

        return ResponseEntity.status(result.getControl().getResponseCode()).contentType(MediaType.APPLICATION_JSON).body(result);
    }
}