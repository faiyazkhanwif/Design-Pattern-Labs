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

    @Override
    public ImageIcon accessorize() {
        URL url = getClass().getResource("/images/banner.png");
        ImageIcon bicon = new ImageIcon(url);
        return bicon;
    }
    
}
