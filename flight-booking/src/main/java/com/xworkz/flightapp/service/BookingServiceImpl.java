package com.xworkz.flightapp.service;

import com.xworkz.flightapp.dao.FlightDAO;
import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import com.xworkz.flightapp.exception.DataInvalidException;
import com.xworkz.flightapp.exception.DataNotSavedException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BookingServiceImpl implements BookingService {

    private FlightDAO flightDAO = new FlightDAO();

    @Override
    public void validateAndSave(BookingInfoDTO bookingInfoDTO)
            throws DataInvalidException, DataNotSavedException {
        System.out.println("in validate and save");
        boolean isInvalid = false;

        if (bookingInfoDTO.getFrom() == null
                || bookingInfoDTO.getFrom().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getDestination() == null
                || bookingInfoDTO.getDestination().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getDate() == null
                || !bookingInfoDTO.getDate().matches("\\d{2}-\\d{2}-\\d{4}")) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getName() == null
                || bookingInfoDTO.getName().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getEmail() == null
                || !(bookingInfoDTO.getEmail().endsWith("@gmail.com")
                || bookingInfoDTO.getEmail().endsWith("@outlook.com")
                || bookingInfoDTO.getEmail().endsWith(".in"))) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getAirline() == null
                || bookingInfoDTO.getAirline().trim().length() < 2) {
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInvalidException("Flight Booking Data is Invalid");
        }
        else {

            if(!flightDAO.emailAndDateCheck(bookingInfoDTO)){
                flightDAO.save(bookingInfoDTO);
            }else {
                System.out.println("email and date not matched");
                throw new DataNotSavedException("data not saved exception");


            }
        }
    }
    public Optional<BookingInfoDTO> validateAndSearch(SearchDto searchDto) throws DataInvalidException {
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
            return  flightDAO.getByEmailAndDate(searchDto);
        }
    }

    @Override
    public List<BookingInfoDTO> validateAndDestinationSearch(SearchDto searchDto) throws DataInvalidException {

        if(searchDto.getDestination() == null
                || searchDto.getDestination().trim().length() < 3){
            throw new DataInvalidException("Search data  is Invalid");
        }else {
            return flightDAO.getByDestination(searchDto);
        }

    }

    @Override
    public void validateAndUpdate(BookingInfoDTO bookingInfoDTO) throws DataInvalidException {

        System.out.println("in validate and update");
        boolean isInvalid = false;

        if (bookingInfoDTO.getFrom() == null
                || bookingInfoDTO.getFrom().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getDestination() == null
                || bookingInfoDTO.getDestination().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getDate() == null
                || !bookingInfoDTO.getDate().matches("\\d{2}-\\d{2}-\\d{4}")) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getName() == null
                || bookingInfoDTO.getName().trim().length() < 3) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getEmail() == null
                || !(bookingInfoDTO.getEmail().endsWith("@gmail.com")
                || bookingInfoDTO.getEmail().endsWith("@outlook.com")
                || bookingInfoDTO.getEmail().endsWith(".in"))) {
            isInvalid = true;
        }

        else if (bookingInfoDTO.getAirline() == null
                || bookingInfoDTO.getAirline().trim().length() < 2) {
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInvalidException("Flight Booking Data is Invalid");
        }
        else {
            flightDAO.update(bookingInfoDTO);
    }
}
}
