package com.dvdev.oop2.example1;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(RANDOM.nextInt());
        print();
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }

}
