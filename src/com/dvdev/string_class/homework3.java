package com.dvdev.string_class;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра,
 * если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW -> ABCCPDDDDIOOSFWW"
 */

public class homework3 {
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = converse(value);
        System.out.println(result);
    }

    public static String converse(String value) {
        String res1 = value.toUpperCase().replace(" ", "");
        String res2 = res1.substring(0,1);
        char temp = res1.charAt(0);
        for (int i = 1; i < res1.length(); i++) {
            if(temp == res1.charAt(i)) {
                continue;
            } else {
                temp = res1.charAt(i);
                res2 += Character.toString(temp);
            }
        }
        return res2;
    }
}
