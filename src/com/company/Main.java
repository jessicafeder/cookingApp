package com.company;

import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        userInput();
        readFile();


        //String[] url = new String[10];
        //System.out.println("https://stackoverflow.com/questions/15290223/declare-array-of-urls");
    }
public static void readFile(){
    try {
        File recipe = new File("/Users/jessi/Documents/cookingApp/src/Files");
        Scanner myRecipe = new Scanner(recipe);
        while (myRecipe.hasNextLine()) {
            String input = myRecipe.nextLine();
            System.out.println(input);
        }
        myRecipe.close();
    } catch (FileNotFoundException e) {
        System.out.println("Not found");
        e.printStackTrace();
    }
}

    public static void userInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Name a protein you have: ");
        String protein = sc.nextLine();  // Read user input
        System.out.println("Your chosen protein is: " + protein + "\n");  // Output user input
        System.out.println("Name a carb you have: ");
        String carb = sc.nextLine();
        System.out.println("Your chosen carb is: " + carb);
        if (protein.equals("Chicken") && carb.equals("Rice")) {
            System.out.println("Here is your recipe");
        }

    }
}
