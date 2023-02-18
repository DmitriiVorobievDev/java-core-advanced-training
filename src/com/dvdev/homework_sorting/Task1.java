package com.dvdev.homework_sorting;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        addStars(list);

    }


    public static List addStars(List<String> list) {
        String temp = "";
        List<String> tempList = new ArrayList<>();
        for (String s : list) {
            if(s.length() == 4) {
                tempList.add("****");
                tempList.add(s);
            } else {
                tempList.add(s);
            }
        }
        System.out.println(tempList);
        return tempList;
    }
}
