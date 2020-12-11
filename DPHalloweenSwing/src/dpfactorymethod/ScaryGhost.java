/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpfactorymethod;

import main.MainJFrame;
import dpfactorymethod.Ghost;
import java.net.URL;
import javax.swing.ImageIcon;

//Used for Factory method pattern.
/**
 *
 * @author faiya
 */
public class ScaryGhost implements Ghost {

    MainJFrame mj;
    private javax.swing.JLabel g2;

    URL url2 = getClass().getResource("/images/gx.gif");

    ImageIcon gicon2 = new ImageIcon(url2);

    public ScaryGhost(MainJFrame mj) {
        this.mj = mj;
        g2 = mj.getGhostimg2();
    }

    @Override
    public void appear() {
        g2.setIcon(gicon2);
        mj.setGhostimg2(g2);
        g2.setVisible(true);
        g2.revalidate();
    }


    @Override
    public void disappear() {
        g2.setVisible(false);
        g2.revalidate();

    }
}
