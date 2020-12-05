/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Simple Factory.

/**
 *
 * @author faiya
 */
public class BigGhost implements Ghost{

    @Override
    public ImageIcon appear() {
        URL url = getClass().getResource("/images/g.png");
        ImageIcon gicon = new ImageIcon(url);
        return gicon;
    }
    
}
