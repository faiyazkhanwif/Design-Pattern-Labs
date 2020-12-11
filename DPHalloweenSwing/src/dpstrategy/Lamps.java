/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

//used for Strategy Pattern

import main.MainJFrame;
import dpstrategy.TreeAccessories;
import dpstrategy.AccessorizeWithLamps;


/**
 *
 * @author faiya
 */
public class Lamps extends TreeAccessories{
    
    public Lamps(MainJFrame mj) {
        super(mj);
        accbehavior = new AccessorizeWithLamps(mj);
    }
    
}
