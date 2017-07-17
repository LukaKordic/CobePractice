package com.example.cobeosijek.myapplication.data_object;


import java.io.Serializable;

public class Car implements Serializable {

    private String carName;
    private int carAge;
    private String carImage;
    private int carSpeed;
    private String carRegistration;

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public Car(String carName, int carAge, String carImage, int carSpeed, String carRegistration) {
        this.carName = carName;
        this.carAge = carAge;
        this.carImage = carImage;
        this.carSpeed = carSpeed;
        this.carRegistration = carRegistration;
    }

    public Car() {

    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public void setCarImage(String carImage) {
        this.carImage = carImage;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public String getCarImage() {
        return carImage;
    }
}
