package com.example.cobeosijek.myapplication;


public class Car {

    private String carName;
    private int carAge;

    public String getCarName() {
        return carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public Car(String carName, int carAge) {

        this.carName = carName;
        this.carAge = carAge;
    }
}
