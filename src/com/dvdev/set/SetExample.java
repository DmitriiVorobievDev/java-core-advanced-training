package com.dvdev.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("bbb");

        System.out.println(set);



    }

}
