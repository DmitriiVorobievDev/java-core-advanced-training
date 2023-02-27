package com.dvdev.date_and_time.practise;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */

public class Task1 {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2020, 6, 25, 19, 47);
        System.out.println(ldt1);
        LocalDateTime ldt2 = ldt1.plusMonths(3L);
        System.out.println(ldt2);
    }
}
