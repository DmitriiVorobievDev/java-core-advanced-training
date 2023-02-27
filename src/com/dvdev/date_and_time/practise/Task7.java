package com.dvdev.date_and_time.practise;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 7. Создать объект Instant. Вывести его на консоль. Затем создать
 * объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
 */

public class Task7 {

    public static void main(String[] args) {
        Instant instant = Instant.now(); //текущее время по гринвичу(без таймзон)
        System.out.println(instant);

        //сколько времени в момент instant в Каире:
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
