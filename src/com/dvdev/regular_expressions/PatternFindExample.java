package com.dvdev.regular_expressions;

/**
 * метод find
 * Ищем частичное совпадение паттерну в строке
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "^asasas+375 (33) 898-33-13 assasas asas  +375 (44) 777-12-13" +
                "asasasdd +375 (29) 657-16-53 dfdgggrrg +375 (25) 111-11-11 sdsd$";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-(\\d{2})";
        // ?: - исключаем группу из списка для метода group
        // (?<code>\\d{2}) - даем имя группе, тому что в ()
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group()); //метод group выводит все группы
            System.out.println(matcher.group(2)); //по номеру группы
            System.out.println(matcher.group("code")); //по названию группы
            System.out.println(matcher.group());
        }
    }
}
