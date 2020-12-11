/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import main.MainJFrame;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author faiya
 */
public class CandleLights implements GroundAccessories   {

    MainJFrame mj;
    private javax.swing.JLabel cd1;
    private javax.swing.JLabel cd2;
    private javax.swing.JLabel cd3;
    private javax.swing.JLabel cd4;
    URL url1 = getClass().getResource("/images/firealt.gif");
    ImageIcon cdicon1 = new ImageIcon(url1);


    public CandleLights(MainJFrame mj) {
        this.mj = mj;
        cd1 = mj.getCandlelight1();
        cd2 = mj.getCandlelight2();
        cd3 = mj.getCandlelight3();
        cd4 = mj.getCandlelight4();

    }

    @Override
    public void set() {

        cd1.setIcon(cdicon1);
        mj.setCandlelight1(cd1);

        cd2.setIcon(cdicon1);
        mj.setCandlelight2(cd2);

        cd3.setIcon(cdicon1);
        mj.setCandlelight3(cd3);

        cd4.setIcon(cdicon1);
        mj.setCandlelight4(cd4);

        cd1.setVisible(true);
        cd2.setVisible(true);
        cd3.setVisible(true);
        cd4.setVisible(true);

        cd1.revalidate();
        cd2.revalidate();
        cd3.revalidate();
        cd4.revalidate();

    }

    @Override
    public void remove() {
        cd1.setVisible(false);
        cd2.setVisible(false);
        cd3.setVisible(false);
        cd4.setVisible(false);

        cd1.revalidate();
        cd2.revalidate();
        cd3.revalidate();
        cd4.revalidate();
    }
    
}
