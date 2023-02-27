package com.dvdev.date_and_time.practise;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 8. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */

public class Task8 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        //используем интерфейс TemporalAdjuster
        LocalDateTime localDateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(localDateTime);
    }
}
