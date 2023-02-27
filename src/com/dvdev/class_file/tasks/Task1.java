package com.dvdev.class_file.tasks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */

public class Task1 {

    private static final String VOWELS = "уеыаэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try(Scanner scanner = new Scanner(path)) {
            while(scanner.hasNext()) {
                String word = scanner.next();
                String firstSymbol = word.charAt(0) + "";
                if(VOWELS.contains(firstSymbol)) {
                    System.out.println(word);
                }
            }
        }
    }
}
