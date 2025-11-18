package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CafeteriaDTO;

public class CafeteriaServiceImpl implements CafeteriaService{
    @Override
    public void validateAndAdd(CafeteriaDTO cafeteriaDTO) {
        System.out.println(cafeteriaDTO);
    }
}
