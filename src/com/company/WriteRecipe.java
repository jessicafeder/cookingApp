package com.company;

import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Reads Recipe.txt file and takes in user input to add text to file
 */

public class WriteRecipe {
    public static void writeRecipe(String filepath, String input) throws IOException {
        FileWriter fw = new FileWriter(filepath, true);
        fw.write("\n" + input);
        fw.close();
    }
}
