package com.company;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Input, output
        System.out.println("Hello, welcome to the Cooking App!\n");

        System.out.println("For a list of recipes press 1, to choose your own ingredients press 2: ");
        String inputChoice = sc.nextLine();
        if(inputChoice.equals("1")){
            System.out.println("Great! Here is a list of recipes for you to choose from: ");

        } else if(inputChoice.equals("2")){
            System.out.println("Fun! Name one of the following proteins: Chicken, Salmon, Beef or Pork ");
        }
        String protein = sc.nextLine();
        System.out.println("Your chosen protein is: " + protein + "\n");

        System.out.println("Name one of the following carbs: Rice, Pasta, Potato ");
        String carb = sc.nextLine();
        System.out.println("Your chosen ingredients are: " + protein + " and " + carb +   "\n");

        readFile(protein, carb);
        playSound();

    }

    /*public boolean readChoices(){
        Scanner sc = new Scanner(System.in);

        if(sc.equals(1)){
            System.out.println("Great! Here is a list of recipes for you to choose from: ");
        } else if(sc.equals(2)){

        }

        return false;
    }*/



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
                }

            }
            myRecipe.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
            e.printStackTrace();
        }
    }

    public static void playSound() {
        File ramsay = new File("sounds/ramsaysoundwav.wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(ramsay));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}