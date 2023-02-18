package com.dvdev.exceptions;

import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static void unsafe(int value) throws TimeoutException {
        System.out.println("unsafe start");
        if(value > 0) {
            throw new TimeoutException();
        }
        System.out.println("unsafe end");
    }

}
