package com.dvdev.homework_sorting;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAvgGrade(), s2.getAvgGrade());
    }

}
