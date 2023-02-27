package com.dvdev.class_file.homework_task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class Task1Runner {

    public static void main(String[] args) throws IOException {
        Path poemPath = Path.of("resources", "Pushkin.txt");
        Map<Character, Integer> characterfrequency = CharacterHelper.calcFrequency(poemPath);

        Path resultPath = Path.of("resources", "task1-result.txt");
        Files.write(resultPath, CharacterHelper.toListRepresentation(characterfrequency), CREATE, TRUNCATE_EXISTING);
    }

}
