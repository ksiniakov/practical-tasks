package com.walking.lesson19_object_methods.model;

import java.util.Objects;

public class Car {
    private int year;
    private String color;
    private String number;
    private int hashcode;

    public Car(String number, int year, String color ) {
        this.year = year;
        this.color = color;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        if (hashcode == 0) {
            hashcode = number.hashCode();
            hashcode += 31 * year;
        }
        return hashcode;
    }

    @Override
    public String toString() {
        return """
                number: %s
                year: %d
                color: %s
                """.formatted(
                number, year, color);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
