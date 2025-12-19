package com.xworkz.ipl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO implements Serializable {
    private String playerName;
    private int age;
    private String playerType;
    private String state;
    private double battingAvg;
    private double bowlingAvg;
    private int stumps;
}
