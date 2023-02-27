package com.dvdev.date_and_time.practise;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 4. Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 */

public class Task4 {

        public static void main(String[] args) {
            String formattedDate = "26-03-1968T09:24";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
            LocalDateTime ldt = LocalDateTime.parse(formattedDate, formatter);
            System.out.println(ldt);

            Instant instant = ldt.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(ldt));
            System.out.println(instant);
            System.out.println(instant.toEpochMilli()); //сколько ms прошло с 01.01.1970 00:00
   }
}


