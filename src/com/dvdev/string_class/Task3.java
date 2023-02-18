package com.dvdev.string_class;

/**
 * Написать ф-цию, принимающую в качестве параметра имя, фамилию и
 * отчество и возвращает инициалы в формате "Ф.И.О."
 *  Учесть, ято входные параметры м.б. в лебом регистре, а
 * результирующая строка д.б. в верхнем.
 */

public class Task3 {
    public static void main(String[] args) {
        String result = format("Ivan", "Petrov", "Sidorovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char lastNameChar = lastName.toUpperCase().charAt(0);
//        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

//        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }

}
