package com.xworkz.wonderla.service;


import com.xworkz.wonderla.dao.WonderlaDAO;
import com.xworkz.wonderla.dto.SearchDto;
import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.exception.DataNotSavedException;

import java.util.Optional;

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

    @Override
    public Optional<WonderlaDTO> validateAndSearch(SearchDto searchDto) throws DataInvalidException {
        Boolean isInvalid = false;

        if (searchDto.getDate() == null
                || !searchDto.getDate().matches("\\d{2}-\\d{2}-\\d{4}") || searchDto.getDate().equals("null"))
            isInvalid = true;
        else if (searchDto.getEmail() == null
                || !(searchDto.getEmail().endsWith("@gmail.com")
                || searchDto.getEmail().endsWith("@outlook.com")
                || searchDto.getEmail().endsWith(".in")))
            isInvalid = true;
        if (isInvalid) {
            throw new DataInvalidException("Search data  is Invalid");
        }else{
          return  wonderlaDAO.getByEmailAndDate(searchDto);
        }
    }
}
