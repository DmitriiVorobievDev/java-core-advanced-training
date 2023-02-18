package com.dvdev.functional_prog.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int course;
    private List<Integer> marksList;
    private double avgMarkValue;

    public Student(String firstName, String lastName, int course, List<Integer> marksList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marksList = marksList;
    }

    public Student(String firstName, String lastName, int course, double avgMarkValue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.avgMarkValue = avgMarkValue;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student1 convertStudent() {
        Student1 tempStudent1 = new Student1(this.getFirstName(), this.getLastName());
        tempStudent1.setCourse(this.getCourse());
        return tempStudent1;
    }

    //create list of students
    public List<Student> createList(Integer integer, Student student) {
        List<Student> tempList = new ArrayList<>();
        for (Student student1 : tempList) {
            tempList.add(student);
        }
        return tempList;
    }

    //add average mark to list
    public static ArrayList<Double> addMarks(Student student, List<Double> list) {
        List<Double> temp = new ArrayList<>();
        temp.add(student.getAvgMarkValue());
        list = temp;
        return (ArrayList<Double>) list;
    }

    public Student getAvgMark() {
        List<Integer> tempList = this.marksList;
        double temp = 0;
        for (Integer integer : tempList) {
            temp += integer;
        }
        temp = temp / tempList.size();
        return new Student(this.getFirstName(), this.getLastName(), this.getCourse(), this.avgMarkValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", marksList=" + marksList +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarksList() {
        return marksList;
    }

    public double getAvgMarkValue() {
        return avgMarkValue;
    }
}


class Student1 implements Comparable<Student1> {
    private String firstName;
    private String lastName;
    private int course;

    public Student1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //create list of students
    public List<Student1> createList(Integer integer, List<Student1> list) {
        List<Student1> tempList = new ArrayList<>();
        for (Student1 student1 : list) {
            if (this.getCourse() == integer) {
                tempList.add(student1);
            }
        }
        return tempList;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return Objects.equals(firstName, student1.firstName) && Objects.equals(lastName, student1.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student1 o) {
        int result = this.getFirstName().compareTo(o.getFirstName());
        return result;
    }
}
