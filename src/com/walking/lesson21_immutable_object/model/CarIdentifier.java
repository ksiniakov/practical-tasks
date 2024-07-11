package com.walking.lesson21_immutable_object.model;

import java.util.Objects;

public class CarIdentifier {
    private final String number;
    private final int year;

    public CarIdentifier(String number, int year) {
        this.number = number;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarIdentifier car = (CarIdentifier) o;
        return year == car.year && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        int hashcode = number.hashCode();
        hashcode += 31 * year;

        return hashcode;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }
}
