package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CustomerFeedBackDTO;

public class CutomerFeedBackServiceImpl implements CustomerFeedBackService{
    @Override
    public void validateAndAdd(CustomerFeedBackDTO customerFeedBackDTO) {
        System.out.println(customerFeedBackDTO);
    }
}
