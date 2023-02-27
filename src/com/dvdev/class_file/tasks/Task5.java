package com.dvdev.class_file.tasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */

public class Task5 {

    public static void main(String[] args) throws IOException {
        //input path:
        Path pathInput = Path.of("src", "com", "dvdev", "class_file", "tasks", "Task4.java");

        //output path:
        Path pathOutput = Path.of("resources", "Task4.java");

        try (Stream<String> lines = Files.lines(pathInput); //read each line
             BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOutput, APPEND, CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
