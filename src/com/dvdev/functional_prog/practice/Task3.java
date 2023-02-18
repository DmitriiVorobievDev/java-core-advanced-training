package com.dvdev.functional_prog.practice;

import java.util.Map;

/**
 * 3. Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 4,
                "strin5", 5
        );
        int result = map.entrySet().stream() //создаем стрим на основе множества entrySet(содержит и ключи и значения)
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(entry -> entry.getValue().intValue()) //получаем стрим int
                .sum(); //суммируем значения
        System.out.println(result);
    }
}
