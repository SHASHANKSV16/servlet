package com.xworkz.wonderla.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class WonderlaDTO implements Serializable , Comparable<WonderlaDTO> {

    private String date;
    private String ticketType;
    private Integer adults;
    private  Integer children;
    private String name;
    private String email;


    @Override
    public int compareTo(WonderlaDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
