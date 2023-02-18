package com.dvdev.interface_comparable;

public class PersonExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Ivan", "Ivanov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));

    }
}
