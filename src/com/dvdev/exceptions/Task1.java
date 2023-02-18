package com.dvdev.exceptions;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */

public class Task1 {

    public static void main(String[] args) {
        String value = null;
        value.length(); //NullPointerException - RuntimeException
    }
}
