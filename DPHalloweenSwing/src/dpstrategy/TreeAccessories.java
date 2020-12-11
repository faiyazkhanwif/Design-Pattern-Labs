/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

import main.MainJFrame;
import dpstrategy.AccessorizeBehavior;
import javax.swing.ImageIcon;

//used for Strategy Pattern

/**
 *
 * @author faiya
 */
public abstract class TreeAccessories {
    AccessorizeBehavior accbehavior;
    MainJFrame mj;

    public TreeAccessories(MainJFrame mj) {
        this.mj = mj;
    }    
    
    public void performAccessorize(){
         accbehavior.accessorize();
    }
    
    public void setAccBehavior(AccessorizeBehavior acc){
        accbehavior = acc;
    }
}
