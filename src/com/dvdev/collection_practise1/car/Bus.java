package com.dvdev.collection_practise1.car;

import java.util.Objects;

public class Bus extends Car {

    private int passengersAmount;

    public Bus(int year, Brand brand, Model model, Color color, int passengersAmount) {
        super(year, brand, model, color);
        this.passengersAmount = passengersAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengersAmount == bus.passengersAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengersAmount=" + passengersAmount +
                '}' + super.toString();
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }
}
