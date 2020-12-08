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
    static MainJFrame mj;
    private javax.swing.JLabel b;
    URL url = getClass().getResource("/images/bats.gif");
    ImageIcon bicon = new ImageIcon(url);

    public Bat(MainJFrame mj) {
        this.mj = mj;
        b = mj.getBat();
    }

    public static Bat getBatInstance(MainJFrame mj) {
        if (uniqueBats == null) {
            uniqueBats = new Bat(mj);
        }
        return uniqueBats;
    }

    @Override
    public void appear() {
        
        b.setIcon(bicon);
        b.setVisible(true);
        b.validate();
    }
    @Override
    public void disappear() {
        b.setVisible(false);
        b.validate();
    }
    
}
