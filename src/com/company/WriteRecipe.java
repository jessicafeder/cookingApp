package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRecipe {
    public static void writeRecipe() throws IOException {
        FileWriter fw;
        fw = new FileWriter("src/Files/Recipe.txt", true);
        Scanner writeRecipe = new Scanner(System.in);

        while(true){
            String input = writeRecipe.nextLine();
            fw.write("\n" + input);
            break;
        }
        writeRecipe.close();
        fw.close();
    }
}
