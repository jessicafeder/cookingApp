package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.Scanner;


public class MainTest {

    @Test
    @DisplayName("Check if two inputs equals a string in a file")
    void readFileTest() {
        ReadFile readFile = new ReadFile();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        readFile.readFile("Chicken", "Rice");
        assertEquals("CHICKEN CURRY WITH RICE: https://www.ica.se/recept/kycklingcurry-med-ris-727027/", outContent.toString().trim());
    }

    @Test
    @DisplayName("Check if correct exception is thrown if not found")
    void playSoundFileTest(){
        File ramsay = new File("sounds/ramsaysoundwa.wav");
        assertThrows(IOException.class, () -> {
            PlaySound.playSound(ramsay);
        });
    }

    @Test
    @DisplayName("Testing that exception is thrown")
    void throwException() {
        assertThrows(IOException.class, () -> {
            FileToArray.fileToArray("src/Files/Recip.txt");
        });
    }

    @Test
    @DisplayName("Testing that input is added to file")
    public void testOutputToFile() throws IOException {
        String filepath = "src/Files/TestFile01.txt";
        String content = "Hej hej";
        String textFromFile = "";
        WriteRecipe.writeRecipe(filepath, content);
        File testTarget = new File(filepath);
        Scanner sc = new Scanner(testTarget);
        while (sc.hasNextLine()) {
            textFromFile = sc.nextLine();
        }
        sc.close();
        assertEquals(textFromFile, content);
        testTarget.delete();
    }
}