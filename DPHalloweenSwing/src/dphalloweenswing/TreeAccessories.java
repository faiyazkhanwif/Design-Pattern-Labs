/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import javax.swing.ImageIcon;

//used for Strategy Pattern

/**
 *
 * @author faiya
 */
public abstract class TreeAccessories {
    AccessorizeBehavior accbehavior;
    
    public ImageIcon performAccessorize(){
        return accbehavior.accessorize();
    }
    
    public void setAccBehavior(AccessorizeBehavior acc){
        accbehavior = acc;
    }
}
