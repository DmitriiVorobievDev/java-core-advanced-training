//package com.dmdev.homework.homa1;
//
//public class Rectangle {
//
//    private Point point1;
//    private Point point2;
//
//    public Rectangle(Point point1, Point point2) {
//        this.point1 = point1;
//        this.point2 = point2;
//    }
//
//    public Point getPoint1() {
//        return point1;
//    }
//
//    public Point getPoint2() {
//        return point2;
//    }
//
//    public void setPoint1(Point point1) {
//        this.point1 = point1;
//    }
//
//    public void setPoint2(Point point2) {
//        this.point2 = point2;
//    }
//
//    public static double surface (Rectangle rectangle) {
//        double x1 = rectangle.getPoint1().getX();
//        double x2 = rectangle.getPoint2().getX();
//        double y1 = rectangle.getPoint1().getY();
//        double y2 = rectangle.getPoint2().getY();
//
//        double surface = Math.abs((x1 - x2) * (y1 - y2));
//        return surface;
//    }
//
//    public static double diagonal (Rectangle rectangle) {
//        double x1 = rectangle.getPoint1().getX();
//        double x2 = rectangle.getPoint2().getX();
//        double y1 = rectangle.getPoint1().getY();
//        double y2 = rectangle.getPoint2().getY();
//
//        double diagonal = Math.sqrt(Math.pow((x1 - x2), 2) * Math.pow((y1 - y2), 2));
//        return diagonal;
//    }
//
//}
