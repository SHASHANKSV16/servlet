package com.xworkz.register.service;

import com.xworkz.register.dto.MatrimonyDTO;
import com.xworkz.register.exception.DataInvalidException;

public interface MatrimonyService {
    void validateAndSave(MatrimonyDTO matrimonyDTO) throws DataInvalidException;
}
