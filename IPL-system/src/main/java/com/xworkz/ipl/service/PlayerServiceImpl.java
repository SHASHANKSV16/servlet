package com.xworkz.ipl.service;

import com.xworkz.ipl.dao.PlayerDAO;
import com.xworkz.ipl.dto.PlayerDTO;
import com.xworkz.ipl.exception.DataInvalidException;
import com.xworkz.ipl.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public class PlayerServiceImpl implements PlayerService{

    PlayerDAO playerDAO = new PlayerDAO();

    @Override
    public void ValidateAndSave(PlayerDTO playerDTO)
            throws DataInvalidException, DataNotSavedException {

        boolean isInvalid = false;

        if (playerDTO.getPlayerName() == null
                || playerDTO.getPlayerName().length() < 3) {
            isInvalid = true;
        }

        else if (playerDTO.getAge() < 10 || playerDTO.getAge() > 60) {
            isInvalid = true;
        }

        else if (playerDTO.getPlayerType() == null
                || !(playerDTO.getPlayerType().equals("Batter")
                || playerDTO.getPlayerType().equals("Bowler")
                || playerDTO.getPlayerType().equals("Allrounder")
                || playerDTO.getPlayerType().equals("Keeper"))) {
            isInvalid = true;
        }

        else if (playerDTO.getState() == null
                || playerDTO.getState().length() < 2) {
            isInvalid = true;
        }

        else if (playerDTO.getPlayerType().equals("Batter")
                && playerDTO.getBattingAvg() <= 0) {
            isInvalid = true;
        }

        else if (playerDTO.getPlayerType().equals("Bowler")
                && playerDTO.getBowlingAvg() <= 0) {
            isInvalid = true;
        }

        else if (playerDTO.getPlayerType().equals("Allrounder")
                && (playerDTO.getBattingAvg() <= 0
                || playerDTO.getBowlingAvg() <= 0)) {
            isInvalid = true;
        }

        else if (playerDTO.getPlayerType().equals("Keeper")
                && (playerDTO.getBattingAvg() <= 0
                || playerDTO.getStumps() <= 0)) {
            isInvalid = true;
        }


        if (isInvalid) {
            throw new DataInvalidException("Player Registration Data is Invalid");
        }else{
            if(!playerDAO.nameCheck(playerDTO)){
                playerDAO.save(playerDTO);
            }else {
                System.out.println("name not matched");
                throw new DataNotSavedException("data not saved exception");
            }
        }
    }

    @Override
    public boolean ValidateAndSearch(String email)
            throws DataInvalidException {

        boolean isInvalid = false;

        if (email == null
                || email.length() < 10
                || !email.endsWith("@ipl.com")) {
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInvalidException("Email is Invalid");
        } else {
            return playerDAO.searchByEmail(email);
        }
    }
    @Override
    public List<PlayerDTO> searchByType(String playerType) {
        return playerDAO.searchByType(playerType);
    }

}




