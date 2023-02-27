package com.dvdev.regular_expressions;

/**
 * метод matches, matcher
 * Ищем полное соответствие строки нашему регулярному выражению
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}"); //создаем паттерн
        Matcher matcher = pattern.matcher("123"); //создаем мэтчер
        System.out.println(matcher.matches()); //проверяем на соответствие строки паттерну

        //1 варинт
        String phoneNumber = "+375 (29) 898-12-13";
        Pattern pattern1 = Pattern.compile("(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        System.out.println(matcher1.matches()); //true or false

        //2 вариант: это же, но можно проще сразу через Pattern:
        String regex = "(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}";
        System.out.println(Pattern.matches(regex, phoneNumber)); //true or false

        //3 вариант через String:
        System.out.println(phoneNumber.matches(regex)); //true or false
    }
}
