package com.xworkz.wonderla.service;


import com.xworkz.wonderla.dao.WonderlaDAO;
import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.exception.DataNotSavedException;

public class WonderlaServiceImpl implements WonderlaService {

    WonderlaDAO wonderlaDAO = new WonderlaDAO();

    @Override
    public void validateAndSave(WonderlaDTO wonderlaDTO) throws DataInvalidException, DataNotSavedException {
        Boolean isInvalid = false;

        if (wonderlaDTO.getDate() == null
                || !wonderlaDTO.getDate().matches("\\d{2}-\\d{2}-\\d{4}") || wonderlaDTO.getDate().equals("null"))
            isInvalid = true;

        else if (wonderlaDTO.getTicketType() == null
                || wonderlaDTO.getTicketType().length() < 3)
            isInvalid = true;

        else if (wonderlaDTO.getAdults() == null
                || wonderlaDTO.getAdults() <= 1)
            isInvalid = true;

        else if (wonderlaDTO.getChildren() == null
                || wonderlaDTO.getChildren() < 0)
            isInvalid = true;

        else if (wonderlaDTO.getName() == null
                || wonderlaDTO.getName().length() < 3)
            isInvalid = true;

        else if (wonderlaDTO.getEmail() == null
                || !(wonderlaDTO.getEmail().endsWith("@gmail.com")
                || wonderlaDTO.getEmail().endsWith("@outlook.com")
                || wonderlaDTO.getEmail().endsWith(".in")))
            isInvalid = true;

        if (isInvalid) {
            throw new DataInvalidException("Wonderla Booking Data is Invalid");
        }else{
            if(!wonderlaDAO.emailAndDateCheck(wonderlaDTO)){
                wonderlaDAO.save(wonderlaDTO);
            }else {
                System.out.println("email aand date not matched");
                throw new DataNotSavedException("data not saved exception");


            }

        }


    }
}
