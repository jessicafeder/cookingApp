package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileToArray {
/**
 * Reads our file and sorts it in alphabetical order
 * @param path defines the filepath you want to read from
 * @throws IOException general if something does not work
 */
    public static void fileToArray(String path) throws IOException {

        List<String> recipesList = Files.readAllLines(Paths.get(path));
        recipesList
                .stream()
                .sorted()
                .forEach(System.out::println);

    }

}
