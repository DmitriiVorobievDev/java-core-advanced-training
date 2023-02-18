package com.dvdev.functional_prog.practice;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
        OptionalDouble optionalDouble = integers.stream()
                .filter(value -> value % 2 != 0) //пропускаем далее по потоку значения, удовлетворяющие условиям
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue) //получаем поток int
                .average(); //вычисляем среднее у потока примитивов

        optionalDouble.ifPresent(System.out::println); //если Optional не пустой, выводим в консоль
    }
}
