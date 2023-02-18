package com.dvdev.string_class;

/**
 * Проверить, является ли введённая строка палиндромом (madam),
 * т.е. читается одинаково в обоих направлениях.
 */

public class homework1 {
    public static void main(String[] args) {
        String value = "kasak";
        System.out.println(isPolyndrom(value));
    }

    public static boolean isPolyndrom(String value) {
        boolean result = false;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == value.charAt(value.length() - 1 - i)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
