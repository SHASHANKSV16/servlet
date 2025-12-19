package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PlayerDTO;
import com.xworkz.ipl.exception.DataInvalidException;
import com.xworkz.ipl.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    public void ValidateAndSave(PlayerDTO dto)throws DataInvalidException, DataNotSavedException;
    public boolean ValidateAndSearch(String email) throws DataInvalidException;
    public List<PlayerDTO> searchByType(String playerType) ;

}
