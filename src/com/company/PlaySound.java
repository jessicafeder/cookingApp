package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class PlaySound {
    protected void playSound() {
        File ramsay = new File("sounds/ramsaysoundwav.wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(ramsay));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() /1000);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

