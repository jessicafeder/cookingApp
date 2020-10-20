package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {
    public static void filewriter() throws IOException {
        String file  = "src/Files/Recipe.txt";
        Scanner writeRecipe = new Scanner(System.in);

        FileWriter fw = new FileWriter(file);
        while(true){
            String input = writeRecipe.nextLine();
            if("DONE".equalsIgnoreCase(input.trim())){
                break;
            }
            fw.write(input);
        }
        writeRecipe.close();
        fw.close();
    }
}
