package com.xworkz.coffeeapp.dto;

import lombok.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CafeteriaDTO implements Serializable, Comparable<String> {

    private String name;
    private String location;
    private String type;
    private Double price;
    private String franchise;
    private String owner;
    private String gst;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
