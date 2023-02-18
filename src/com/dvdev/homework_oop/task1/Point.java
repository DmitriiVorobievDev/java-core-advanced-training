package com.dvdev.homework_oop.task1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(Point point) {
        double distance = Math.sqrt((Math.pow(point.getX(), 2) + (Math.pow(point.getY(), 2))));
        return distance;
    }
}
