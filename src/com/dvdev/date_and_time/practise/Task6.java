package com.dvdev.date_and_time.practise;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * 6. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */

public class Task6 {

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

        //можно создать LocalDateTime на основании LocalDate
//        LocalDateTime ldt1 = LocalDateTime.of(now, LocalTime.MIDNIGHT); //получаем полночь даты
        LocalDateTime ldt1 = now.atStartOfDay(); //тоже, что и предыдущая строка
//        LocalDateTime ldt2 = LocalDateTime.of(prevDate, LocalTime.MIDNIGHT); ////получаем полночь даты
        LocalDateTime ldt2 = prevDate.atStartOfDay(); //тоже, что и предыдущая строка

        Duration duration = Duration.between(ldt2, ldt1);
        System.out.println(duration.getSeconds());
    }
}
