package com.xworkz.flightapp.dao;

import com.xworkz.flightapp.constants.DBConstants;
import com.xworkz.flightapp.dto.BookingInfoDTO;
import com.xworkz.flightapp.dto.SearchDto;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

public class FlightDAO {

    @SneakyThrows
    public void save(BookingInfoDTO bookingInfoDTO) {
        System.out.println("in save");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String insertQuery = "INSERT INTO flight (`from`, destination, `date`, airline, name, email) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(), DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, bookingInfoDTO.getFrom());
            preparedStatement.setString(2, bookingInfoDTO.getDestination());
            preparedStatement.setString(3, bookingInfoDTO.getDate());
            preparedStatement.setString(4, bookingInfoDTO.getAirline());
            preparedStatement.setString(5, bookingInfoDTO.getName());
            preparedStatement.setString(6, bookingInfoDTO.getEmail());
            preparedStatement.executeUpdate();
            System.out.println(bookingInfoDTO);

        }
    }

    @SneakyThrows
    public boolean emailAndDateCheck(BookingInfoDTO bookingInfoDTO) {
        System.out.println("in email and date check");
        boolean isPresent = false;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String checkQuery = "SELECT 1 FROM flight WHERE email = ? AND `date` = ?";

        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(), DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(checkQuery)) {

            preparedStatement.setString(1, bookingInfoDTO.getEmail());
            preparedStatement.setString(2, bookingInfoDTO.getDate());
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                isPresent = true;
            }
        }
        return isPresent;
    }
@SneakyThrows
    public Optional<BookingInfoDTO> getByEmailAndDate(SearchDto searchDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String searchQuery = "Select * From flight where `date` = ? AND email =?";

        try(Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(),DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)){
            preparedStatement.setString(1,searchDto.getDate());
            preparedStatement.setString(2,searchDto.getEmail());
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){

                String from = resultSet.getString(2);
                String destination = resultSet.getString(3);
                String date = resultSet.getString(4);
                String airline = resultSet.getString(5);
                String name = resultSet.getString(6);
                String email = resultSet.getString(7);
                BookingInfoDTO bookingInfoDTO = new BookingInfoDTO(from,destination,date,name,email,airline);
                return Optional.of(bookingInfoDTO);
            }

        }
        return Optional.empty();
    }
    }

