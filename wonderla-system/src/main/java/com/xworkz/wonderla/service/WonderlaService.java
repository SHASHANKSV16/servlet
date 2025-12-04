package com.xworkz.wonderla.service;

import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;

public interface WonderlaService {

    void validateAndSave(WonderlaDTO wonderlaDTO) throws DataInvalidException;
}
