package com.walking.lesson21_immutable_object.service;

import com.walking.lesson21_immutable_object.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(Car target) {

        for (Car car : cars) {
            if (car.getCarIdentifier().equals(target.getCarIdentifier()))
                return car;
        }

        return null;
    }
}
