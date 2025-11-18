package com.xworkz.coffeeapp.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


public class CoffeeDTO implements Serializable , Comparable<String> {
    String type;
    Integer quantity;
    Double price;
    String farmer;
    String location;

    @Override
    public int compareTo(String o) {
        return this.type.compareTo(o);
    }

}
