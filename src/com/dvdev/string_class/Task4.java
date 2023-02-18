package com.dvdev.string_class;

/**
 * Подсчитать кол-во всех точек, запятых и восклицательных знаков в строке.
 */

public class Task4 {
    public static void main(String[] args) {
        String value = "efsefsf,..!!.FDWFEdf";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "").replace(",", "").
                replace("!", "");
        return value.length() - result.length();
    }
}
