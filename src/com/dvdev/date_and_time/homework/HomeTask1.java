package com.dvdev.date_and_time.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 * Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла
 * дату на ближайшее (в днях) 1 января.
 */

public class HomeTask1 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime result = adjustToNearestYear(now);
        System.out.println(result);
    }

    private static LocalDateTime adjustToNearestYear(LocalDateTime localDateTime) {
        return localDateTime.with(it -> {
            Temporal currentYear = it.with(TemporalAdjusters.firstDayOfYear());
            Temporal nextYear = it.with(TemporalAdjusters.firstDayOfNextYear());
            long betweenCurrentYear = ChronoUnit.DAYS.between(currentYear, it);
            long betweenNextYear = ChronoUnit.DAYS.between(it, nextYear);

            return betweenCurrentYear < betweenNextYear ? currentYear : nextYear;
        });
    }
}
