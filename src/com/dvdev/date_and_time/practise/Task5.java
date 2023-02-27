package com.dvdev.date_and_time.practise;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 5. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */

public class Task5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDate, now);
        System.out.println(period.getYears()); //года без учета месяцев и дней
        System.out.println(period.getMonths()); //месяцы без учета годов и дней
        System.out.println(period.getDays()); //дни без учета годов и месяцев

        //если нужно пересчитать года и месяцы в дни, то использовать класс
        long days = ChronoUnit.DAYS.between(prevDate, now); //получаем все дни(года месяцы тоже пересчитаны в дни)
        System.out.println(days);
    }
}
