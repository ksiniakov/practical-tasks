package com.walking.lesson19_object_methods.service;

import com.walking.lesson19_object_methods.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(Car target) {

        for (Car car : cars) {
            if (car.hashCode() == target.hashCode() && car.equals(target))
                return car;
        }

        return null;
    }
}
