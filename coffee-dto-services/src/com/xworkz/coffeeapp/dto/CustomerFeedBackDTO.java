package com.xworkz.coffeeapp.dto;

import lombok.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString


public class CustomerFeedBackDTO implements Serializable, Comparable<String> {

    private String name;
    private String email;
    private String comments;
    private Double rating;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
