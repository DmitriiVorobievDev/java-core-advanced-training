package com.dvdev.homework_inheritance;

public class Room {
    private boolean isPassing;

    public Room(boolean isPassing) {
        this.isPassing = isPassing;
    }

    public boolean getIsPassing() {
        return isPassing;
    }

    public void setIsPassing(boolean passing) {
        isPassing = passing;
    }

    public void print() {
        System.out.println("Is the room passing? " + isPassing);
    }
}
