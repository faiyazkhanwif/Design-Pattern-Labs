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
public class AccessorizeWithBanner implements AccessorizeBehavior {

    MainJFrame mj;
    private javax.swing.JLabel b1;

    public AccessorizeWithBanner(MainJFrame mj) {
        this.mj = mj;
        b1 = mj.getBanner();
    }

    URL url = getClass().getResource("/images/banner.png");
    ImageIcon bicon = new ImageIcon(url);

    @Override
    public void accessorize() {

        b1.setIcon(bicon);
        b1.setVisible(true);
        b1.revalidate();

    }

}
