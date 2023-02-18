package com.dvdev.functional_prog.practice.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */

public class Task5 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)
        );
        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge)) //returns Optional
                .map(Person::getFullName) //преобразуем person в полное имя
                .ifPresent(System.out::println); //если существует, выводим в консоль

        Map<Integer, List<String>> map = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, //ключом будет возраст
                        Collectors.mapping(Person::getFullName, Collectors.toList()))); //значением будет fullName
        System.out.println(map);

        //этот способ работает, если ключи уникальны(разные возраста у всех Person)
        Map<Integer, Person> personMap = persons.stream()
                .collect(Collectors.toMap(Person::getAge, Function.identity())); //ключом будет age, значением Person
        System.out.println(map); //Function.identity() тоже, что и: person -> person
    }
}
