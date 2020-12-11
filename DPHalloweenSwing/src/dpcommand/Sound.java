/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpcommand;

import main.MainJFrame;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

//Used for Command Pattern
/**
 *
 * @author faiya
 */
public class Sound {

    Clip clip;
    URL urlic = getClass().getResource("/images/soundon.png");
    URL urlic2 = getClass().getResource("/images/soundoff.png");
    ImageIcon sicon = new ImageIcon(urlic);
    ImageIcon sicon2 = new ImageIcon(urlic2);
    private javax.swing.JButton soundbtn;
    MainJFrame mj;

    public Sound(Clip backgroundSound, MainJFrame mj) {
        this.clip = backgroundSound;
        this.mj = mj;
        soundbtn = mj.getSoundbtn();

    }

    public void turnOn() {
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        soundbtn.setIcon(sicon);
        soundbtn.setVisible(true);
        soundbtn.revalidate();
    }

    public void turnOff() {
        clip.stop();
        soundbtn.setIcon(sicon2);
        soundbtn.setVisible(true);
        soundbtn.revalidate();
    }
}
