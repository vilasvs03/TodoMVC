package com.assignment.model.request;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MerchantRequest {
    private static final int DEFAULT_PAGE_SIZE = 5;
    private String merchantId;
    private String mobileNo;
    private int pageNumber;
    private int pageSize = DEFAULT_PAGE_SIZE;
}
