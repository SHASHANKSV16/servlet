package com.xworkz.register.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MatrimonyDTO implements Serializable , Comparable {

    private String email;
    private String forWhom;
    private String gender;
    private String dob;
    private String motherTongue;
    private String religion;
    private String martialStatus;
    private int height;





    @Override
    public int compareTo(Object o) {

        return this.email.compareTo(email);
    }
}
