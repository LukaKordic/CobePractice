package com.example.cobeosijek.myapplication;


public class Car {

    private String carName;
    private int carAge, carImg;

    public Car(String carName, int carAge, int carImg) {

        this.carName = carName;
        this.carAge = carAge;
        this.carImg = carImg;

    }

    int getCarImg() {
        return carImg;
    }

    String getCarName() {
        return carName;
    }

    int getCarAge() {
        return carAge;
    }
}
