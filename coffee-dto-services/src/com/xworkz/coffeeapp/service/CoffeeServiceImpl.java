package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CoffeeDTO;

public class CoffeeServiceImpl implements CoffeeService {

    @Override
    public void validateAndAdd(CoffeeDTO coffeeDTO) {
        System.out.println(coffeeDTO);
    }
}
