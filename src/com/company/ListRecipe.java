package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListRecipe {
    public String listFile(){
        String result = "";
        try {
            File recipe = new File("src/Files/Recipe.txt");
            Scanner myRecipe = new Scanner(recipe);

            while (myRecipe.hasNextLine()) {
                result += myRecipe.nextLine() + "\n";
            }
            myRecipe.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
            e.printStackTrace();

        }

        return result + "\nGood luck and have fun!";

    }
}
