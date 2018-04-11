package com.example.cobeosijek.myapplication.data_object;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Serializable {

    private String carName;
    private int carAge;
    private List<String> carImages = new ArrayList<>();
    private int carSpeed;
    private String carRegistration;

    public Car(String carName, int carAge, List<String> carImage, int carSpeed, String carRegistration) {
        this.carName = carName;
        this.carAge = carAge;
        this.carImages = carImage;
        this.carSpeed = carSpeed;
        this.carRegistration = carRegistration;
    }

    public Car() {
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public String getCarImage(int position) {
        return carImages.get(position);
    }

    public List<String> getCarImageList() {
        return carImages;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarAge() {
        return carAge;
    }
}
