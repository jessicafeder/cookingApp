package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Reads Recipe.txt file and takes in user input to add text to file
 */

public class WriteRecipe {
    public static void writeRecipe() throws IOException {
        FileWriter fw;
        fw = new FileWriter("src/Files/Recipe.txt", true);
        Scanner writeRecipe = new Scanner(System.in);
        String input = writeRecipe.nextLine();
        fw.write("\n" + input);
        writeRecipe.close();
        fw.close();
    }
}
