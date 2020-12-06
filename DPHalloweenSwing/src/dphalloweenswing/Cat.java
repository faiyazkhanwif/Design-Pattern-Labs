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
public class Cat implements Animal {
    private static Cat uniqueCat;

    public Cat() {
    }
    
    public static Cat getCatInstance(){
        if (uniqueCat == null) {
            uniqueCat = new Cat();
        }
        return uniqueCat;
    }
    @Override
    public ImageIcon appear() {
        URL url = getClass().getResource("/images/cat.gif");
        ImageIcon gicon = new ImageIcon(url);
        return gicon;
    }

}
