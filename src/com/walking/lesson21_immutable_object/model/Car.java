package com.walking.lesson21_immutable_object.model;

public class Car {

    private String color;

    private final CarIdentifier carIdentifier;


    public Car(String number, int year, String color) {
        this.color = color;
        carIdentifier = new CarIdentifier(number, year);
    }

    @Override
    public String toString() {
        return """
                number: %s
                year: %d
                color: %s
                """.formatted(
                carIdentifier.getNumber(), carIdentifier.getYear(), color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarIdentifier getCarIdentifier() {
        return carIdentifier;
    }
}
