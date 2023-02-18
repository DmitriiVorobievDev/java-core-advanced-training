package com.dvdev.string_class;

/*
* Заменить все грустные смайлы :( в строке на веселые :)
 */

public class Task1 {

    public static void main(String[] args) {
        String value = "sdadf :( fcsdfdf :( dfgsdf :) cdfsd :) sefsf :) fg ";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }

}
