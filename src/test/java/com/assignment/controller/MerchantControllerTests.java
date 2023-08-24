package com.assignment.controller;

import com.assignment.TodoMVC;
import com.assignment.model.request.MerchantRequest;
import com.assignment.model.response.MerchantResponse;
import com.assignment.service.MerchantDetailsRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = TodoMVC.class)
public class MerchantControllerTests {
    @Autowired
    MerchantController merchantController;

    @MockBean
    MerchantDetailsRepo merchantDetailsRepo;

    @Test
    public void testMerchantDetailsWhenRequestBodyIsBlank() {
        when(merchantDetailsRepo.merchantDetails(any())).thenReturn(getMerchantResponse());
        ResponseEntity<Object> response = merchantController.merchantDetails(getMerchantRequest());
        Assertions.assertEquals(response.getStatusCodeValue(),200);
    }

    @Test
    public void testMerchantDetailsWhenMerchantIdIsPresent() {
        when(merchantDetailsRepo.merchantDetails(any())).thenReturn(getMerchantResponse());
        MerchantRequest merchantRequest = new MerchantRequest();
        merchantRequest.setMerchantId("10000000001");
        ResponseEntity<Object> response = merchantController.merchantDetails(merchantRequest);
        Assertions.assertEquals(response.getStatusCodeValue(),200);
    }

    private MerchantRequest getMerchantRequest(){
        return new MerchantRequest();
    }

    private MerchantResponse getMerchantResponse(){
        return new MerchantResponse();
    }
}
