package com.assignment.model.merchant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Merchant {
    @Id
    @Column(name = "MERCHANT_ID")
    private String merchantId;
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Column(name = "BUSINESS_LEGAL_NAME")
    private String businessLegalName;
    @Column(name = "MERCHANT_TYPE")
    private int merchantType;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;
    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;
    @Column(name = "PINCODE")
    private String pin;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
}