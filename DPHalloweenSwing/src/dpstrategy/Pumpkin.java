/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpstrategy;

import main.MainJFrame;

//used for Strategy Pattern
/**
 *
 * @author faiya
 */
public class Pumpkin extends TreeAccessories {

    public Pumpkin(MainJFrame mj) {
        super(mj);
        accbehavior = new AccessorizeWithPumpkin(mj);
    }

}
