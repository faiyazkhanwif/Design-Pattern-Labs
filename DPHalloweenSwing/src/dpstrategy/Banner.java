/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

//used for Strategy Pattern

import main.MainJFrame;



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
