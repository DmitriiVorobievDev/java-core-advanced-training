package com.dvdev.homework_inheritance;

public class Floor {
    private int floorNumber;
    private Apartment[] apartments;

    public Floor(int floorNumber, Apartment[] apartments) {
        this.floorNumber = floorNumber;
        this.apartments = apartments;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("The floor number is " + floorNumber +
                ", the apartments are " + apartments.length);
    }
}
