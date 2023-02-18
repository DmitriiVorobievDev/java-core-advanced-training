package com.dvdev.collection_practise1.car;

import java.util.Objects;

public class Car {
    private int year;
    private Brand brand;
    private Model model;
    private Color color;

    public Car(int year, Brand brand, Model model, Color color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car cat = (Car) o;
        return year == cat.year &&
                Objects.equals(brand, cat.brand) &&
                Objects.equals(model, cat.model) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, brand, model, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "year=" + year +
                ", brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                '}';
    }

    public int getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }
}
