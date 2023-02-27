package com.dvdev.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Замена искомых строк на нужные нам значения
 */

public class ZamenaStrok {

    public static void main(String[] args) {
        String phoneNumber = "^asasas+375 (33) 898-33-13 assasas asas  +375 (44) 777-12-13" +
                "asasasdd +375 (29) 657-16-53 dfdgggrrg +375 (25) 111-11-11 sdsd$";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder(); //сюда запишем результат после замены

        while (matcher.find()) { //каждый раз когда находим искомую строку
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
            matcher.appendReplacement(stringBuilder, "$2 $3 $4"); //заменяем ее на значение в параметре
        } //$1 $2 $3 ссылки на группы, значит вывести группы через пробел
        matcher.appendTail(stringBuilder); //чтобы не терять хвост строки phoneNumber
        System.out.println(stringBuilder);

        //2 вариант заменить подстроки исп. класс String:
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
