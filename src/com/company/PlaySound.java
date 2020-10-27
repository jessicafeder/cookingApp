package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

/**
 * Reads our .wav file to play a sound at the end of our code
 * Here we use a try and catch to catch exception e
 */

public class PlaySound {
    static void playSound(File file) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() /1000);

    }
}

