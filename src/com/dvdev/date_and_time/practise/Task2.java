package com.dvdev.date_and_time.practise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */

public class Task2 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = ld1.format(formatter);
        System.out.println(format);
    }
}
