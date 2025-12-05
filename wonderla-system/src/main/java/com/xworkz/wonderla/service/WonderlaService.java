package com.xworkz.wonderla.service;

import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.exception.DataNotSavedException;

public interface WonderlaService {

    void validateAndSave(WonderlaDTO wonderlaDTO) throws DataInvalidException, DataNotSavedException;
}
