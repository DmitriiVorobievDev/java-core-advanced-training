package com.dvdev.date_and_time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.ZoneOffset.UTC;

public class DateTimeDemo {

    public static void main(String[] args) {

        //текущее время из класса ZonedDateTime
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long toEpochMilli = now.toInstant().toEpochMilli(); //сколько милисекунд прошло с unix time
        System.out.println(toEpochMilli);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS); //прибавляем к текущму времени 1 день
        System.out.println(plus);

        ZonedDateTime plusMin = now.plusMinutes(1);
        System.out.println(plusMin);

        ZonedDateTime minus = now.minus(1L, ChronoUnit.HOURS); //вычитаем из текущего времени 1 день
        System.out.println(minus);

        ZonedDateTime z1 = now.truncatedTo(ChronoUnit.DAYS); //обнулить дату, т.е. убрать милисекунды, секунды и т.д.
        System.out.println(z1); //все единицы до дня обнулены (ms, s, min, h)

        //метод get() - получить любую составляющую времени
        now.getHour();

       //метод format принимает  DateTimeFormatter и возвращает строку
//        String s = now.format();

        LocalDateTime someTime = LocalDateTime.of(1999, 3, 20, 10, 10, 10, 100);
        System.out.println(someTime);

       //текущее время из класса LocalDateTime
        LocalDateTime now1 = LocalDateTime.now(UTC); //в формате UTC
        System.out.println(now1);

        //получить время в текущей тайм зоне
        System.out.println(LocalDateTime.now());
    }
}
