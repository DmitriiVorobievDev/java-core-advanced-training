package com.dvdev.homework_oop.task3;

public final class ShapeUtils {

    private ShapeUtils() {

    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
