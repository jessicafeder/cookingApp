package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRecipe {
    public static void writeRecipe() throws IOException {
        FileWriter fw = null;
        fw = new FileWriter("src/Files/Recipe.txt", true);
        //String file  = "src/Files/Recipe.txt",;
        Scanner writeRecipe = new Scanner(System.in);

        //FileWriter fw = new FileWriter(file);
        while(true){
            String input = writeRecipe.nextLine();
            if("".equalsIgnoreCase(input.trim())){
                break;
            }
            fw.write("\n" + input);
        }
        writeRecipe.close();
        fw.close();
    }
}
