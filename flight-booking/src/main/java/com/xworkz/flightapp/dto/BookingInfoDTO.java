package com.xworkz.flightapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingInfoDTO implements Serializable , Comparable {

    private String from;
    private String destination;
    private String date;
    private String name;
    private String email;
    private String airline;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
