package com.dvdev.functional_prog.practice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );
        int result1 = strings.stream()
                .filter(value -> value.length() > 8) //фильтруем - пропускаем далее строки длиной более 8
                .collect(Collectors.toSet()) //собираем стрим в Set, к-й гарантирует уникальность элементов
                .size(); //находим кол-во искомых строк - это р-р сета
        System.out.println(result1);

        //2й вариант:
        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct() //метод убирает дубликаты из стрима
                .count(); //считаем кол-во элементов стрима
        System.out.println(result2);
    }
}
