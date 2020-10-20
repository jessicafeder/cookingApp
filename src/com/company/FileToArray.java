package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileToArray {

    public static void fileToArray() throws IOException {
        List<String> recipesList = Files.readAllLines(Paths.get("src/Files/Recipe.txt"));


        recipesList
                .stream()
                .sorted()
                .forEach(System.out::println);

    }
}
