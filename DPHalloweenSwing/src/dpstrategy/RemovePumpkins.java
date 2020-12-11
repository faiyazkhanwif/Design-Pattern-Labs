/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

import main.MainJFrame;

//used for Strategy Pattern
/**
 *
 * @author faiya
 */
public class RemovePumpkins implements AccessorizeBehavior {

    MainJFrame mj;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;

    public RemovePumpkins(MainJFrame mj) {
        this.mj = mj;
        p1 = mj.getPumpkin1();
        p2 = mj.getPumpkin2();
        p3 = mj.getPumpkin3();
        p4 = mj.getPumpkin4();
    }

    @Override
    public void accessorize() {

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
