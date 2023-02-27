package com.dvdev.class_file;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String collect = fileReader.lines() //считываем строки
                    .collect(Collectors.joining("\n")); //коллектим строки в одну
            System.out.println(collect);
        }

    }
}
