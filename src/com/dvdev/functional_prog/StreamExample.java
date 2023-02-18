package com.dvdev.functional_prog;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        IntSummaryStatistics intSummaryStatistics = strings.stream() //Stream<String>
                //после вызова метода stream() начинаем работать с каждым элементом коллекции
                .map(string -> string + string) //метод map() для преобразования элементов
                .map(Integer::valueOf) //преобразуем элемент
                .filter(value -> value % 2 == 0)
                .sorted() //сортировка по умолчанию интерфейс comparable()
                .skip(1) //пропускаем 1 элемент
                .mapToInt(value -> value.intValue()) //преобразуем текущий стрим в IntStream
//                .mapToObj(intValue -> Integer.valueOf(intValue)) //преобразуем в стрим объектов
                .summaryStatistics(); //получаем статистику по IntStream
        System.out.println(intSummaryStatistics);

        Stream.of("88", "11", "22", "33", "44", "55", "66")
               .peek(System.out::println)
               .collect(Collectors.toList());

        IntStream.of(1, 4, 5, 6);
        IntStream.range(0, 10) //создаем intStream от 0 до 9
                .forEach(intValue -> System.out.println(intValue)); //каждый элемент выводим в консоль

        //бесконечный итератор на IntStream:
        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);

//  то же ,что и:
//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if(intValue % 2 ==0) {
//                System.out.println(intValue);
//            }
//        }
    }
}