package com.xworkz.surveyapp.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class SurveyDto implements Serializable, Comparable {

    String name;
    String occupation;
    String education;
    String nativePlace;
    Long mobile;
    Long aadhaar;
    String pan;
    String voterId;
    String passport;
    String ration;
    Long income;
    String bankAccount;
    String fatherName;
    String motherName;
    String married;
    String spouseName;
    Long children;
    Long familyMembers;
    String caste;
    String religion;
    String motherTongue;
    Long age;
    String dob;
    String diseases;
    Long height;
    Long weight;
    String complexion;
    String bloodGroup;
    Long shoeSize;
    Long shoeCount;
    String friends;
    String bikeNo;
    String carNo;
    Long cycles;
    Long acres;
    Long sites;
    String rtc;
    String taxes;
    String buildingOwner;
    String crop;
    String insuranceCompany;
    String insuranceNo;
    String loanNo;
    Long loanBalance;
    String loanType;
    String shareHolding;
    String laptop;
    String tv;
    String govtEmployee;
    String disabled;
    String electricityBill;
    String waterBill;
    Long gold;
    Long silver;
    String pet;
    Long cows;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
