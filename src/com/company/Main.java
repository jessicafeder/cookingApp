package com.company;

import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        PlaySound mySound = new PlaySound();
        ReadFile myFile = new ReadFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, welcome to the Cooking App!\n");

        System.out.println("For a list of recipes press 1, to choose your own ingredients press 2: ");
        String inputChoice = sc.nextLine();
        if(inputChoice.equals("1")){
            System.out.println("Great! Here is a list of recipes for you to choose from: \n ");
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

        myFile.readFile(protein, carb);
        mySound.playSound();

    }



}