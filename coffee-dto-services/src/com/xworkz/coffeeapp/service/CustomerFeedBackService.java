package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CustomerFeedBackDTO;

public interface CustomerFeedBackService {
    void validateAndAdd(CustomerFeedBackDTO customerFeedBackDTO);
}
