package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;


public class PlaySound {
/**
 * Reads our .wav file to play a sound at the end of our code
 * @param file defines the file, in this case the audio file
 * @throws LineUnavailableException if a line is not available
 * @throws IOException general if something does not work
 * @throws UnsupportedAudioFileException if an audio file is not recognized
 * @throws InterruptedException as we use thread.sleep to make sure it isn´t interrupted
 */
    static void playSound(File file) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() /1000);

    }
}

