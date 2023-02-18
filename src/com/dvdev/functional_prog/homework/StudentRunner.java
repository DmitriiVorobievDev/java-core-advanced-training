package com.dvdev.functional_prog.homework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentRunner {

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Ivanov", 1, List.of(5, 4));
        Student s2 = new Student("Petr", "Petrov", 2, List.of(5, 5, 5, 5, 4));
        Student s3 = new Student("Vasya", "Pupkin", 4, List.of(3, 2, 3, 3, 3));
        Student s4 = new Student("Mariya", "Sidorenko", 5, List.of(5, 3, 4, 4, 3));
        Student s5 = new Student("Kuzya", "Maslenkov", 1, List.of(2, 2, 2, 2, 2));
        Student s6 = new Student("Viktoria", "Viktorova", 3, List.of(5, 2, 2));
        Student s7 = new Student("Mitya", "Mityaev", 2, List.of(1, 1, 1));

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
//        students.add(s5);
        students.add(s6);
//        students.add(s7);

        //1st condition:
        Map<Integer, Double> map1 = students.stream()
                .filter(student -> student.getMarksList().size() > 3) //stream Student (filtered)
                .peek(student -> student.getAvgMark()) //stream Student (with avgMark)
                .collect(Collectors.toMap(student -> student.getCourse(), student -> student.getAvgMarkValue()));
        System.out.println(map1);

        //2nd condition:
        Map<Integer, List<Student1>> map2 = students.stream()
                .map(student -> student.convertStudent())
                .collect(Collectors.toMap(Student1::getCourse, student -> student.createList(student.getCourse(), List.of(student))));
        System.out.println(map2);
    }

        //3rd condition:


}


