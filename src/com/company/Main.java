package com.company;

import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        //ListRecipe myRecipeList = new ListRecipe();
        PlaySound mySound = new PlaySound();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, welcome to the Cooking App!\n");

        System.out.println("For a list of recipes press 1, to choose your own ingredients press 2: ");
        String inputChoice = sc.nextLine();
        if(inputChoice.equals("1")){
            System.out.println("Great! Here is a list of recipes for you to choose from: \n \n"); //+ myRecipeList.listFile());
            FileToArray.fileToArray();
            System.out.println("\nGood luck and have fun!");
            return;

        } else if(inputChoice.equals("2")){
            System.out.println("Fun! Name one of the following proteins: Chicken, Salmon, Beef or Pork ");
        }
        String protein = sc.nextLine();
        System.out.println("Your chosen protein is: " + protein + "\n");

        System.out.println("Name one of the following carbs: Rice, Pasta, Potato ");
        String carb = sc.nextLine();
        System.out.println("Your chosen ingredients are: " + protein + " and " + carb +   "\n");

        readFile(protein, carb);
        mySound.playSound();

    }


    public static void readFile(String protein, String carb) {
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