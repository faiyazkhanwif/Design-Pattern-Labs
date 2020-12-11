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
public class Bat implements Animal {

    private static Bat uniqueBats;
    URL url = getClass().getResource("/images/bats.gif");
    ImageIcon bicon = new ImageIcon(url);

    public static Bat getBatInstance() {
        if (uniqueBats == null) {
            //uniqueBats = new Bat(mj);
            uniqueBats = new Bat();
        }
        return uniqueBats;
    }

    @Override
    public ImageIcon appear() {
        return bicon;
    }

    @Override
    public ImageIcon disappear() {
        URL url1 = getClass().getResource("");
        ImageIcon bicon1 = new ImageIcon(url1);
        return bicon1;
    }

}
