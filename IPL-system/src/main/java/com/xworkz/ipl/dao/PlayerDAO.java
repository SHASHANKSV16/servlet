package com.xworkz.ipl.dao;

import com.xworkz.ipl.constants.DBConstants;
import com.xworkz.ipl.dto.PlayerDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
    @SneakyThrows
    public void save(PlayerDTO playerDTO) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String insertQuery =
                "INSERT INTO player " +
                        "(player_name, age, player_type, state, batting_avg, bowling_avg, stumps) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getProperties(),DBConstants.USERNAME.getProperties(), DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, playerDTO.getPlayerName());
            preparedStatement.setInt(2, playerDTO.getAge());
            preparedStatement.setString(3, playerDTO.getPlayerType());
            preparedStatement.setString(4, playerDTO.getState());
            preparedStatement.setDouble(5, playerDTO.getBattingAvg());
            preparedStatement.setDouble(6, playerDTO.getBowlingAvg());
            preparedStatement.setInt(7, playerDTO.getStumps());

            preparedStatement.executeUpdate();

            System.out.println(playerDTO);
            System.out.println("in dao");
        }
    }

    @SneakyThrows
    public boolean nameCheck(PlayerDTO playerDTO) {

        boolean isPresent = false;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String checkQuery = "SELECT 1 FROM player WHERE player_name = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstants.URL.getProperties(),
                DBConstants.USERNAME.getProperties(),
                DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(checkQuery)) {

            preparedStatement.setString(1, playerDTO.getPlayerName());

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                isPresent = true;
            }
        }

        return isPresent;
    }
    @SneakyThrows
    public boolean searchByEmail(String email) {

        boolean isPresent = false;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "SELECT 1 FROM emailBidders WHERE email = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstants.URL.getProperties(),
                DBConstants.USERNAME.getProperties(),
                DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, email);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                isPresent = true;
            }
        }

        return isPresent;
    }
    @SneakyThrows
    public List<PlayerDTO> searchByType(String playerType) {

        List<PlayerDTO> list = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");

        String query =
                "SELECT player_name, age, player_type, state, batting_avg, bowling_avg, stumps " +
                        "FROM player WHERE player_type = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstants.URL.getProperties(),
                DBConstants.USERNAME.getProperties(),
                DBConstants.PWD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, playerType);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                PlayerDTO dto = new PlayerDTO();
                dto.setPlayerName(rs.getString("player_name"));
                dto.setAge(rs.getInt("age"));
                dto.setPlayerType(rs.getString("player_type"));
                dto.setState(rs.getString("state"));
                dto.setBattingAvg(rs.getDouble("batting_avg"));
                dto.setBowlingAvg(rs.getDouble("bowling_avg"));
                dto.setStumps(rs.getInt("stumps"));

                list.add(dto);
            }
        }

        return list;
    }



}
