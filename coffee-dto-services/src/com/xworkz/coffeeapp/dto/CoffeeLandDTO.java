package com.xworkz.coffeeapp.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CoffeeLandDTO implements Serializable , Comparable<Double> {

    Double acre;
    Double yeild;
    Integer totalPlants;
    Double expenditure;
    Double profit;
    Double fertilizerQuantity;

    @Override
    public int compareTo(Double o) {
        return (int) (this.acre - acre);
    }
}
