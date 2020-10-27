package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileToArrayTest {
    @Test
    @DisplayName("Testing that exception is thrown")
    void throwException() {
        assertThrows(IOException.class, () -> {
            FileToArray.fileToArray("src/Files/Recip.txt");
        });
    }
}
