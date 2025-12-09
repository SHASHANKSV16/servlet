package com.xworkz.wonderla.service;

import com.xworkz.wonderla.dto.SearchDto;
import com.xworkz.wonderla.dto.WonderlaDTO;
import com.xworkz.wonderla.exception.DataInvalidException;
import com.xworkz.wonderla.exception.DataNotSavedException;

import java.util.Optional;

public interface WonderlaService {

    void validateAndSave(WonderlaDTO wonderlaDTO) throws DataInvalidException, DataNotSavedException;
    Optional<WonderlaDTO> validateAndSearch(SearchDto searchDto)throws DataInvalidException;
}
