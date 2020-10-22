package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public void readFile(String protein, String carb) {
        try {
            File recipe = new File("src/Files/Recipe.txt");
            Scanner myRecipe = new Scanner(recipe);
            while (myRecipe.hasNextLine()) {
                String input = myRecipe.nextLine();
                if (input.contains(protein.toUpperCase()) && input.contains(carb.toUpperCase())) {
                    System.out.println(input);
                }

            }
            myRecipe.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
            e.printStackTrace();
        }
    }
}
