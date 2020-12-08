/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

//used for Strategy Pattern
/**
 *
 * @author faiya
 */
public class RemoveBanner implements AccessorizeBehavior {

    MainJFrame mj;
    private javax.swing.JLabel b1;

    public RemoveBanner(MainJFrame mj) {
        this.mj = mj;
        b1 = mj.getBanner();
    }

    @Override
    public void accessorize() {
        b1.setVisible(false);
        b1.revalidate();
    }
}
