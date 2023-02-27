package com.dvdev.class_file.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */

public class Task4 {

    public static void main(String[] args) throws IOException {
        //reading file
        Path path1 = Path.of("src", "com", "dvdev", "class_file", "tasks", "Task3.java");
        String stringValue = Files.readString(path1); //read whole file as a String
        String result = stringValue.replace("public", "private");

        //writing file
        Path path2 = Path.of("resources", "Task3.java");
        Files.writeString(path2, result); //write string to a new file
    }
}
