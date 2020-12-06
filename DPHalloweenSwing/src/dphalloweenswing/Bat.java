/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Singleton Pattern.
/**
 *
 * @author faiya
 */
public class Bat implements Animal{
private static Bat uniqueBats;

    public Bat() {
    }
    
    public static Bat getBatInstance(){
        if (uniqueBats == null) {
            uniqueBats = new Bat();
        }
        return uniqueBats;
    }
    @Override
    public ImageIcon appear() {
        URL url = getClass().getResource("/images/bats.gif");
        ImageIcon gicon = new ImageIcon(url);
        return gicon;    
    }
    
}
