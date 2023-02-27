package com.dvdev.class_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesClassRunner {

    public static void main(String[] args) throws IOException {

        //запись в файл с пом. класса Files
        Path path = Path.of("resources", "writer2.txt");
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
        //то же самое, но еще проще:
        Path path1 = Path.of("resources", "writer.txt");
        Files.write(path, List.of("Hello World", "Java"));

        //чтение с файла с пом. класса Files
        Path path2 = Path.of("resources", "test.txt");
        try(Stream<String> lines = Files.lines(path2)) {
            lines.forEach(System.out::println);
        }
    }
}
