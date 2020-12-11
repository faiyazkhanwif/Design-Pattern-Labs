/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpsingleton;

import dpsingleton.Animal;
import java.net.URL;
import javax.swing.ImageIcon;

//Used for Singleton Pattern.
/**
 *
 * @author faiya
 */
public class Cat implements Animal {

    private static Cat uniqueCat;

    URL url = getClass().getResource("/images/cat.gif");
    ImageIcon cicon = new ImageIcon(url);

    public static Cat getCatInstance() {
        if (uniqueCat == null) {
            uniqueCat = new Cat();
        }
        return uniqueCat;
    }

    @Override
    public ImageIcon appear() {
        return cicon;
    }

    @Override
    public ImageIcon disappear() {
        URL url1 = getClass().getResource("");
        ImageIcon cicon1 = new ImageIcon(url1);
        return cicon1;
    }

}
