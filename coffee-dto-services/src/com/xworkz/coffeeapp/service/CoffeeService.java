package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CoffeeDTO;

public interface CoffeeService {
    void validateAndAdd(CoffeeDTO coffeeDTO);
}
