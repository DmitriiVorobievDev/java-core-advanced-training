package com.dvdev.concurrent.practice;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 2. Задан массив случайных целых чисел (от 1 до 300)
 * случайной длины (до 1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами: в
 * одном потоке и используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 */

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        int[] values = new int[100_000_000];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(300) + 1; //генерируем инт от 1 до 300
        }
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        trackTime(() -> findMax(values));
        trackTime(() -> {
            try {
                return findMaxParallel(values, threadPool);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            return Integer.MIN_VALUE;
        });
        threadPool.shutdown();
        threadPool.awaitTermination(10L, TimeUnit.MINUTES);
    }

    /**
     * --------- max -
     * --------- max - max
     * --------- max -
     */

    private static int trackTime(Supplier<Integer> task) {
        long startTime = System.currentTimeMillis();
        int result = task.get();
        System.out.println(result + ": " + (System.currentTimeMillis() - startTime));
        return result;
    }

    private static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxParallel(int[] values, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() ->IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE)).get(); //метод get у Future - блокирует поток
    }
}
