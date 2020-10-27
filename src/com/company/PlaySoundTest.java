package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaySoundTest {
    @Test
    @DisplayName("Check if correct exception is thrown if not found")
    void playSoundFileTest(){
        File ramsay = new File("sounds/ramsaysoundwa.wav");
        assertThrows(IOException.class, () -> {
            PlaySound.playSound(ramsay);
        });
    }
}
