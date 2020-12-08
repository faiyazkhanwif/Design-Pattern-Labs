/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//Used for Command Pattern
/**
 *
 * @author faiya
 */
public class SoundClipSetup {
    public Clip createClip() {
        URL urls = getClass().getResource("/sound/bgsound.wav");
        AudioInputStream audioInputStream;
        Clip clip = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(urls.openStream());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            return clip;
        }
    }
}
