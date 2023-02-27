package com.dvdev.class_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) throws IOException {
//        File file = new File(String.join(File.separator,"resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
        byte[] bytes = new byte[inputStream.available()];
        int counter = 0;
        byte currentByte;
        while((currentByte = (byte)inputStream.read()) != -1) { //читаем по 1 байту
            bytes[counter++] = currentByte; //если метод read() возвращает -1 -значит байты закончились в файле
        }
        String stringValue = new String(bytes);
            System.out.println(stringValue);
//            byte[] bytes = inputStream.readAllBytes(); //читаем все байты файла сразу
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}
