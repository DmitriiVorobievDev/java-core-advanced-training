package com.dvdev.functional_prog;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator.compare(25, 100));

//    private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        //модиф. возвр название([параметры])

//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }


//    }

    }
}
