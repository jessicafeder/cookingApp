package com.company;

import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name one of the following proteins: Chicken, Salmon, Beef or Pork ");
        String protein = sc.nextLine();  // Read user input
        System.out.println("Your chosen protein is: " + protein + "\n");  // Output user input
        System.out.println("Name one of the following carbs: Rice, Pasta, Potato ");
        String carb = sc.nextLine();
        System.out.println("Your chosen carb is: " + carb + "\n");

        readFile(protein, carb);

    }


    /**
     * This method helps us read file from Recipe.txt
     *
     * @param protein keyword needed for recipe generator
     * @param carb    keyword needed for recipe generator
     */
    public static void readFile(String protein, String carb) {
        try {
            File recipe = new File("src/Files/Recipe.txt");
            Scanner myRecipe = new Scanner(recipe);
            while (myRecipe.hasNextLine()) {
                String input = myRecipe.nextLine();
                if (input.contains(protein.toLowerCase()) && input.contains(carb.toLowerCase())) {
                    System.out.println(input);
                } else {
                    System.err.println("No recipe found with those ingredients."); //This repeats 5x??
                }

            }
            myRecipe.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
            e.printStackTrace();
        }
    }

}
