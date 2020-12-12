/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpcommand;


//Used for Command Pattern
/**
 *
 * @author faiya
 */
public class SoundOffCommand implements Command {
    Sound sound;
    
    public SoundOffCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.turnOff();
    }
}
