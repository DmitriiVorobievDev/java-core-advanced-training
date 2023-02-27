package com.dvdev.multithreading.task_counter;

/**
 * 1. Создать класс Counter с одним полем:
 * private int count;
 * <p>
 * Добавить методы:
 * - getCount() - для получение поля count
 * - increment() - для увеличения значения поля на единицу
 * - decrement() - для уменьшения значения поля на единицу
 */

public class Counter {

    private static String description;
    private int count;

    public static void init() {
        Class<Counter> counterClass = Counter.class;
        synchronized (counterClass) {
            if (description == null) {
                description = "Test description";
            }
        }
    }

    public void increment() {
        synchronized (this) {
            this.count++;
        }
    }

    public synchronized void decrement() {
        this.count--;
    }

    public int getCount() {
        return count;
    }
}
