/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import main.MainJFrame;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author faiya
 */
public class CampFire implements GroundAccessories {

    MainJFrame mj;
    private javax.swing.JLabel cf;

    URL url1 = getClass().getResource("/images/campfire.gif");

    ImageIcon cficon1 = new ImageIcon(url1);

    public CampFire(MainJFrame mj) {
        this.mj = mj;
        cf = mj.getCampfire();

    }

    @Override
    public void set() {
        cf.setIcon(cficon1);
        mj.setCampfire(cf);
        cf.setVisible(true);
        cf.revalidate();
    }

    @Override
    public void remove() {
        cf.setVisible(false);
        cf.revalidate();
    }
}
