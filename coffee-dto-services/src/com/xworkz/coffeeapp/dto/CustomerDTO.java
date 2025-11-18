package com.xworkz.coffeeapp.dto;

import lombok.*;
import java.io.Serializable;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CustomerDTO implements Serializable, Comparable<String> {

    private String name;
    private Long mobile;
    private String coffeeFlavour;
    private Integer quantity;
    private String paymentMode;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
