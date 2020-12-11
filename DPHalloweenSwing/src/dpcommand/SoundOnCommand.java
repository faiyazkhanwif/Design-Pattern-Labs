/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpcommand;

import dpcommand.Sound;


//Used for Command Pattern
/**
 *
 * @author faiya
 */
public class SoundOnCommand implements Command{
    Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }
    
    @Override
    public void execute() {
        sound.turnOn();
    }
    
}
