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
public class Banner extends TreeAccessories{

    public Banner(MainJFrame mj) {
        super(mj);
        accbehavior = new AccessorizeWithBanner(mj);
    }
    
}
