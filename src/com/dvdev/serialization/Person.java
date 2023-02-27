package com.dvdev.serialization;

import java.io.Serializable;

public class Person implements Serializable {


    private static final long serialVersionUID = 5157642237136363257L;
    private int age;
    private String firstName;

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
