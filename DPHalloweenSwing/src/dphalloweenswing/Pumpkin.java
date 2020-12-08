/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author faiya
 */
public class Pumpkin implements GroundAccessories {

    MainJFrame mj;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    URL url1 = getClass().getResource("/images/pumpkin.gif");
    URL url2 = getClass().getResource("/images/pumpkinx.gif");
    URL url3 = getClass().getResource("/images/pumpkiny.gif");
    URL url4 = getClass().getResource("/images/pumpkinz.gif");
    ImageIcon pficon1 = new ImageIcon(url1);
    ImageIcon pficon2 = new ImageIcon(url2);
    ImageIcon pficon3 = new ImageIcon(url3);
    ImageIcon pficon4 = new ImageIcon(url4);

    public Pumpkin(MainJFrame mj) {
        this.mj = mj;
        p1 = mj.getPumpkin1();
        p2 = mj.getPumpkin2();
        p3 = mj.getPumpkin3();
        p4 = mj.getPumpkin4();

    }

    @Override
    public void set() {

        p1.setIcon(pficon1);
        mj.setPumpkin1(p1);

        p2.setIcon(pficon2);
        mj.setPumpkin2(p2);

        p3.setIcon(pficon3);
        mj.setPumpkin3(p3);

        p4.setIcon(pficon4);
        mj.setPumpkin4(p4);

        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        p4.setVisible(true);

        p1.revalidate();
        p2.revalidate();
        p3.revalidate();
        p4.revalidate();

    }

    @Override
    public void remove() {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);

        p1.revalidate();
        p2.revalidate();
        p3.revalidate();
        p4.revalidate();
    }

}
