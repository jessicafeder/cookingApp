package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WriteRecipeTest {
    @Test
    @DisplayName("Testing that input is added to file")
    public void testInputToFile() throws IOException {
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

