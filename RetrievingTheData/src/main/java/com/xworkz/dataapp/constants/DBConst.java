package com.xworkz.dataapp.constants;

public enum DBConst {
    URL("jdbc:mysql://localhost:3306/task2"),
    USERNAME("root"),
    PWD("Shashank@123");


    private String property;

    DBConst(String property){
        this.property=property;

    }

    public String getProperty() {
        return property;
    }
}
