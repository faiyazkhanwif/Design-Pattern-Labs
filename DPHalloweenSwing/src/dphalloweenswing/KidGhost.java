/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Simple Factory.
/**
 *
 * @author faiya
 */
public class KidGhost implements Ghost {

    MainJFrame mj;
    private javax.swing.JLabel g3;

    URL url3 = getClass().getResource("/images/kid.png");

    ImageIcon gicon3 = new ImageIcon(url3);

    public KidGhost(MainJFrame mj) {
        this.mj = mj;
        g3 = mj.getKid();
    }

    @Override
    public void appear() {
        g3.setIcon(gicon3);
        mj.setKid(g3);
        g3.setVisible(true);
        g3.revalidate();
    }

    @Override
    public void disappear() {
        g3.setVisible(false);
        g3.revalidate();

    }
}
