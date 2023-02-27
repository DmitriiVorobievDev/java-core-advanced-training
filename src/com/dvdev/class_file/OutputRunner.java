package com.dvdev.class_file;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) { //true-добавлять текст, а не перезаписывать
            String value = "Hello, World!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes()); //перевод курсора на новую строку
        }
    }
}
