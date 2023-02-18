package com.dvdev.functional_prog.map_reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * Имеем 3 000 000 студентов. Нужно найти самого старшего из них
     * Разбиваем студентов на группы. Каждая группа обрабатывается
     * отдельно(параллельно)
     *
     * [1 000 000] -> age -> max //преобразуем студентов в их возрасты и находим max
     *
     * [1 000 000] -> age -> max
     *
     * [1 000 000] -> age -> max
     *
     */

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        )
       .sequential() //вычисляем в одном потоке, исп. вместо parallel()
//         .parallel() //активируем распараллеливание вычислений
//         .map(Student::getAge)
//                .filter(student -> student.getAge() < 18)
         .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2); //получаем optional
//         .ifPresent(System.out::println); //вызывается на optional

        maybeStudent.ifPresent(System.out::println);
        maybeStudent.map(student -> student.getAge())
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);

    }
}
