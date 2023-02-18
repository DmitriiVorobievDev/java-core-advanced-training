package com.dvdev.homework_sorting;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFullName().compareTo(s2.getFullName());
    }
}
