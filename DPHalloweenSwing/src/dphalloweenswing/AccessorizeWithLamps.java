/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

//used for Strategy Pattern
/**
 *
 * @author faiya
 */
public class AccessorizeWithLamps implements AccessorizeBehavior {

    MainJFrame mj;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;

    public AccessorizeWithLamps(MainJFrame mj) {
        this.mj = mj;
        l1 = mj.getLamp1();
        l2 = mj.getLamp2();
        l3 = mj.getLamp3();
        l4 = mj.getLamp4();
        l5 = mj.getLamp5();
        l6 = mj.getLamp6();
        l7 = mj.getLamp7();
    }

    URL url = getClass().getResource("/images/lamp.png");
    ImageIcon licon = new ImageIcon(url);

    @Override
    public void accessorize() {


        l1.setIcon(licon);
        l2.setIcon(licon);
        l3.setIcon(licon);
        l4.setIcon(licon);
        l5.setIcon(licon);
        l6.setIcon(licon);
        l7.setIcon(licon);

        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(true);
        l7.setVisible(true);

        l1.revalidate();
        l2.revalidate();
        l3.revalidate();
        l4.revalidate();
        l5.revalidate();
        l6.revalidate();
        l7.revalidate();
    }

}
