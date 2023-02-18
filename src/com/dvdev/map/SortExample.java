package com.dvdev.map;

import com.dvdev.interface_comparable.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        //создаем изменяемый лист - будем менять порядок элементов
        List<String> strings = Arrays.asList("123", "345", "14", "678");

        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );
        Collections.sort(personList);
        System.out.println(personList);

        // Collections.sort(personList, new FirstNameComparator()); //old style
        personList.sort(Comparator.comparing(Person::getFirstName).
                thenComparing(Person::getLastName)); //c Java 8
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            // сортируем по firstName
            return o1.getFirstName().compareTo(o2.getFirstName()); //для String реализован метод compareTo()
        }
    }
}
