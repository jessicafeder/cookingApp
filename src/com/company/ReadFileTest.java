package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTest {
    @Test
    @DisplayName("Check if two inputs equals a string in a file")
    void readFileTest() {
        ReadFile readFile = new ReadFile();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        readFile.readFile("Chicken", "Rice");
        assertEquals("CHICKEN CURRY WITH RICE: https://www.ica.se/recept/kycklingcurry-med-ris-727027/", outContent.toString().trim());
    }
}
