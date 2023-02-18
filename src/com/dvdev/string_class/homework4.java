package com.dvdev.string_class;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 *
 * Написать 2 метода:
 *
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 *
 * Посчитать сумму всех чисел из строки
 *
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class homework4 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numbers = getNumbers(value);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sumNumbersArray(numbers));
    }

    public static int[] getNumbers (String value) {
        String tempNumbers = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '0' ||
                    value.charAt(i) == '1' ||
                    value.charAt(i) == '2' ||
                    value.charAt(i) == '3' ||
                    value.charAt(i) == '4' ||
                    value.charAt(i) == '5' ||
                    value.charAt(i) == '6' ||
                    value.charAt(i) == '7' ||
                    value.charAt(i) == '8' ||
                    value.charAt(i) == '9') {
            tempNumbers += Character.toString(value.charAt(i));
            }
        }
        int[] res1 = new int[tempNumbers.length()];
        for (int i = 0; i < tempNumbers.length(); i++) {
//            res1[i] = (int)tempNumbers.charAt(i);
            res1[i] = Integer.parseInt(Character.toString(tempNumbers.charAt(i)));
        }
        return res1;
    }

    public static int sumNumbersArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
