package com.dvdev.exceptions;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */

public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DvdevException exception) {
            System.out.println("caught in main");
            exception.printStackTrace();
        }

        }

    public static void catchCustomException() {
            try {
                unsafe();
            } catch (RuntimeException exception) {
                System.out.println("caught in catchCustomException method");
                throw new DvdevException(exception);
            }
        }



    public static void unsafe() {
        throw new RuntimeException("Ooooops");
    }

}
