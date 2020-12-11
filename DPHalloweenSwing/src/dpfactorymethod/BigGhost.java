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
public class BigGhost implements Ghost {

    MainJFrame mj;
    private javax.swing.JLabel g1;

    URL url1 = getClass().getResource("/images/g.png");

    ImageIcon gicon1 = new ImageIcon(url1);

    public BigGhost(MainJFrame mj) {
        this.mj = mj;
        g1 = mj.getGhostimg();
    }

    @Override
    public void appear() {
        g1.setIcon(gicon1);
        mj.setGhostimg(g1);
        g1.setVisible(true);
        g1.revalidate();
    }


    @Override
    public void disappear() {
        g1.setVisible(false);
        g1.revalidate();
    }

}
