package com.xworkz.wonderla.dao;

import com.xworkz.wonderla.constants.DBConstants;
import com.xworkz.wonderla.dto.WonderlaDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class WonderlaDAO {


    @SneakyThrows

   public  void save(WonderlaDTO wonderlaDTO){
        Class.forName("com.mysql.cj.jdbc.Driver");
        String insertQuery = "INSERT INTO wonderla (date, ticket_type, adult, children, name, email) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(),DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
           PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){

           preparedStatement.setString(1,wonderlaDTO.getDate());
           preparedStatement.setString(2,wonderlaDTO.getTicketType());
           preparedStatement.setInt(3, wonderlaDTO.getAdults());
           preparedStatement.setInt(4, wonderlaDTO.getChildren());
           preparedStatement.setString(5,wonderlaDTO.getName());
           preparedStatement.setString(6,wonderlaDTO.getEmail());
           preparedStatement.executeUpdate();
           System.out.println(wonderlaDTO);

       }

    }
    @SneakyThrows
    public boolean emailAndDateCheck(WonderlaDTO wonderlaDTO){
        boolean isPresent = false;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String checkQuery = "SELECT 1 FROM wonderla WHERE email = ? AND date = ?";

        try(Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(),DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
            PreparedStatement preparedStatement = connection.prepareStatement(checkQuery)){

            preparedStatement.setString(1,wonderlaDTO.getEmail());
            preparedStatement.setString(2,wonderlaDTO.getDate());
            ResultSet rs= preparedStatement.executeQuery();
            if (rs.next()){
                isPresent = true;
            }

        }


        return isPresent;
    }
}
