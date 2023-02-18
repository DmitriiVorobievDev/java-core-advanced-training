package com.dvdev.collection_practise3;

import java.util.HashSet;
import java.util.Map;

/**
 * 3. Написать метод isUnique, который принимает Map&lt;String, String&gt;
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальное значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins}
 */

public class Task3 {

    public static void main(String[] args) {
        //Map<String, String> com.dmdev.map = new HashMap<>();
//        com.dmdev.map.put("Marty", "Stepp");
//        com.dmdev.map.put("Stuart", "Reges");
//        com.dmdev.map.put("Jessica", "Miller");
//        com.dmdev.map.put("Amanda", "Camp");
//        com.dmdev.map.put("Hal", "Perkins");
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Reges",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
