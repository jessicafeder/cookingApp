package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteRecipe {
/**
 * Reads .txt file and takes in user input to add text to file
 * @param filepath defines the filepath you want to write to
 * @param input takes in user input to the file
 * @throws IOException general if something does not work
 */
    public static void writeRecipe(String filepath, String input) throws IOException {
        FileWriter fw = new FileWriter(filepath, true);
        fw.write("\n" + input);
        fw.close();
    }
}
