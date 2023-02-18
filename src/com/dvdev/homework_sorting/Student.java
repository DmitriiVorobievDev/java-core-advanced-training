package com.dvdev.homework_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

    private String firstName = "";
    private String lastName = "";
    private String fullName = firstName + " " + lastName;
    private int age;
    private double avgGrade;

    public Student(String firstName, String lastName, int age, double avgGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return (int)Double.compare(this.getAvgGrade(), s.getAvgGrade());
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student st1 = new Student("Denis", "Matveenka", 30, 10.0);
        Student st2 = new Student("Zaur", "Tregulov", 32, 9.5);
        Student st3 = new Student("Ivan", "Ivanov", 22, 5.6);
        Student st4 = new Student("Pedr", "Pedrishev", 28, 7.7);
        Student st5 = new Student("Mariya", "Babisheva", 40, 8.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        maxAvgGrade(list);

        System.out.println("--------------------");

        list.sort(new StudentFullNameComparator());
        System.out.println(list);

        System.out.println("--------------------");

        list.sort(new StudentAgeComparator());
        System.out.println(list);

        System.out.println("--------------------");

        list.sort(Comparator.comparing(Student::getAvgGrade));
        System.out.println(list);

    }

    public static void maxAvgGrade(List<Student> list) {
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }
}
