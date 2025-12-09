package com.xworkz.flightapp.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DBConstants {

    URL("jdbc:mysql://localhost:3306/mvc"),
    USERNAME("root"),
    PWD("Shashank@123");

    private String properties;

}