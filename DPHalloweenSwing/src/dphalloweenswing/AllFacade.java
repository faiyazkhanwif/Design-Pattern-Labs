/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

//Facade design pattern
/**
 *
 * @author faiya
 */
public class AllFacade {
    MainJFrame mj;
    GhostFactory gfactory;
    Ghost bigghost; 
    Ghost scaryghost; 
    Ghost kidghost;
    GroundAccessories candleLights;
    TreeAccessories mylamps;
    Animal blackcat;
    GroundAccessories cfire;
    Pumpkin pumpkin;
    Animal bats;
    TreeAccessories mybanner;

    public AllFacade(MainJFrame mj,GhostFactory gfactory, GroundAccessories candleLights,
            TreeAccessories mylamps, Animal blackcat, GroundAccessories cfire,
            Pumpkin pumpkin, Animal bats, TreeAccessories mybanner) {
        this.mj = mj;
        this.gfactory = gfactory;
        this.candleLights = candleLights;
        this.mylamps = mylamps;
        this.blackcat = blackcat;
        this.cfire = cfire;
        this.pumpkin = pumpkin;
        this.bats = bats;
        this.mybanner = mybanner;
        bigghost = gfactory.getGhost("big");
        scaryghost = gfactory.getGhost("scary"); 
        kidghost = gfactory.getGhost("kid");
    }

    public void turnAllOn() {
        bigghost.appear();
        scaryghost.appear();
        kidghost.appear();
        candleLights.set();
        mylamps.performAccessorize();
        blackcat.appear();
        cfire.set();
        pumpkin.set();
        bats.appear();
        mybanner.performAccessorize();

    }

    public void turnAllOff() {
        bigghost.disappear();
        scaryghost.disappear();
        kidghost.disappear();
        candleLights.remove();
        mylamps.setAccBehavior(new RemoveLamps(mj));
        mylamps.performAccessorize();
        blackcat.disappear();
        cfire.remove();
        pumpkin.remove();
        bats.disappear();
        mybanner.setAccBehavior(new RemoveBanner(mj));
        mybanner.performAccessorize();
    }
}
