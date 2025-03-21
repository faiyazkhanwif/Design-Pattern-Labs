/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

import main.MainJFrame;
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
    URL url = getClass().getResource("/images/banner.png");
    ImageIcon bicon = new ImageIcon(url);

    public AccessorizeWithBanner(MainJFrame mj) {
        this.mj = mj;
        b1 = mj.getBanner();
    }

    @Override
    public void accessorize() {

        b1.setIcon(bicon);
        b1.setVisible(true);
        b1.revalidate();

    }

}
