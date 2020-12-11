/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

//used for Strategy Pattern

import main.MainJFrame;
import dpstrategy.AccessorizeBehavior;

/**
 *
 * @author faiya
 */
public class RemoveLamps implements AccessorizeBehavior {

    MainJFrame mj;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;

    public RemoveLamps(MainJFrame mj) {
        this.mj = mj;
        l1 = mj.getLamp1();
        l2 = mj.getLamp2();
        l3 = mj.getLamp3();
        l4 = mj.getLamp4();
        l5 = mj.getLamp5();
        l6 = mj.getLamp6();
        l7 = mj.getLamp7();
    }

    @Override
    public void accessorize() {

        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);

        l1.revalidate();
        l2.revalidate();
        l3.revalidate();
        l4.revalidate();
        l5.revalidate();
        l6.revalidate();
        l7.revalidate();
    }

}
