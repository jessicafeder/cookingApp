package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Check if audio file is .wav")
    void playSoundFileTest() {
        File ramsay = new File("sounds/ramsaysoundwav.wav");
        assertTrue(ramsay.canRead());

    }

    @Test
    @DisplayName("Testing that exception is thrown")
    void throwException() {
        assertThrows(IOException.class, () -> {
            FileToArray.fileToArray("src/Files/Recipe.txt");
        });
    }



}
