package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void ValidateAndAdd(CustomerDTO customerDTO) {
        System.out.println(customerDTO);
    }
}
