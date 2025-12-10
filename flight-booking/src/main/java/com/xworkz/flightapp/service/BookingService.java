package com.xworkz.flightapp.service;

import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import com.xworkz.flightapp.exception.DataInvalidException;
import com.xworkz.flightapp.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    void validateAndSave(BookingInfoDTO bookingInfoDTO) throws DataInvalidException, DataNotSavedException;
    public Optional<BookingInfoDTO> validateAndSearch(SearchDto searchDto) throws DataInvalidException;
    public List<BookingInfoDTO> validateAndDestinationSearch(SearchDto searchDto)throws DataInvalidException;
}
