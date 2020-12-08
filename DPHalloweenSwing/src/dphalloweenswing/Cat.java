/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Singleton Pattern.
/**
 *
 * @author faiya
 */
public class Cat implements Animal {

    private static Cat uniqueCat;

    static MainJFrame mj;
    private javax.swing.JLabel c;
    URL url = getClass().getResource("/images/cat.gif");
    ImageIcon cicon = new ImageIcon(url);

    private Cat(MainJFrame mj) {
        this.mj = mj;
        c = mj.getCat();
    }

    public static Cat getCatInstance(MainJFrame mj) {
        if (uniqueCat == null) {
            uniqueCat = new Cat(mj);
        }
        return uniqueCat;
    }

    @Override
    public void appear() {
        c = mj.getCat();
        c.setIcon(cicon);
        c.setVisible(true);
        c.validate();
    }

    @Override
    public void disappear() {
        c.setVisible(false);
        c.validate();
    }

}
