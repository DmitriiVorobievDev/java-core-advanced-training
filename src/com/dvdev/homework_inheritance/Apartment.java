package com.dvdev.homework_inheritance;

public class Apartment {
    private int apartmentNumber;
    private Room[] rooms;

    public Apartment(int apartmentNumber, Room[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("The apartment number is " + apartmentNumber +
                ", The rooms are " + rooms.length);
    }
}
