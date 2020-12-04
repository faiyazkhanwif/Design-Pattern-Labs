/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import javax.sound.sampled.Clip;

/**
 *
 * @author faiya
 */
public class SoundManager {
    Command slot;

    public SoundManager() {
        
    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
    
}
