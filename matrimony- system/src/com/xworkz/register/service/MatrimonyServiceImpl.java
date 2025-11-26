package com.xworkz.register.service;

import com.xworkz.register.dto.MatrimonyDTO;
import com.xworkz.register.exception.DataInvalidException;

public class MatrimonyServiceImpl implements MatrimonyService{
    @Override
    public void validateAndSave(MatrimonyDTO matrimonyDTO) throws DataInvalidException {
        Boolean isInvalid = false;

        if (matrimonyDTO.getEmail() == null
                || !(matrimonyDTO.getEmail().endsWith("@gmail.com")
                || matrimonyDTO.getEmail().endsWith("@outlook.com")
                || matrimonyDTO.getEmail().endsWith(".in"))) isInvalid = true;

        else if (matrimonyDTO.getForWhom() == null
                || matrimonyDTO.getForWhom().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getGender() == null
                || matrimonyDTO.getGender().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getDob() == null
                || matrimonyDTO.getDob().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getMotherTongue() == null
                || matrimonyDTO.getMotherTongue().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getReligion() == null
                || matrimonyDTO.getReligion().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getMartialStatus() == null
                || matrimonyDTO.getMartialStatus().length() < 3) isInvalid = true;

        else if (matrimonyDTO.getHeight() <= 0
                || matrimonyDTO.getHeight() > 250) isInvalid = true;

        if (isInvalid) {
            throw new DataInvalidException("Data is Invalid");
        }
    }
}
