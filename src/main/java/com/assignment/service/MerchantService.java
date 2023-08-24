package com.assignment.service;

import com.assignment.model.merchant.Merchant;
import com.assignment.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantService {

    @Autowired()
    MerchantRepository merchantRepository;

    public List<Merchant> getMerchants() {
        List<Merchant> list = new ArrayList<>();
        Iterable<Merchant> items = merchantRepository.findAll();
        items.forEach(list::add);
        return list;
    }

    public Merchant getMerchantById(String merchantId){
        Optional<Merchant> optional = merchantRepository.findById(merchantId);
        return optional.orElse(null);
    }

}