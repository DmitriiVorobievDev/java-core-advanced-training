package com.dvdev.homework_inheritance;

public class House {
    private int houseNumber;
    private Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("The house number is " + houseNumber +
                ", the floors are " + floors.length);
    }

}
