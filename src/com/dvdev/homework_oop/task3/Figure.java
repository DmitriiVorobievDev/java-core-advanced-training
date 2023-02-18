package com.dvdev.homework_oop.task3;

public abstract class Figure {

    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();

}
