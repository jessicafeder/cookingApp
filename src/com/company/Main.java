package com.company;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void recipeUrl() {
        /*URL[] url = new URL[10];
        URL url = new URL( "http://baeldung.com");
        url[0] = ("http://baeldung.com");*/

    }

    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name one protein: ");
        String protein = sc.nextLine();  // Read user input
        System.out.println("Your protein is: " + protein);  // Output user input
    }

    public static void main(String[] args) {
        userInput();
        String[] url = new String[10];
        //System.out.println("https://stackoverflow.com/questions/15290223/declare-array-of-urls");
        System.out.println("Hello World");
    }
}
