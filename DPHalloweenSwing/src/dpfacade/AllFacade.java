/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpfacade;

//Facade design pattern

import dpsingleton.Animal;
import dpfactorymethod.GhostCaller;
import dpfactorymethod.Ghost;
import other.GroundAccessories;
import main.MainJFrame;
import dpstrategy.TreeAccessories;
import dpstrategy.RemoveLamps;
import dpstrategy.RemoveBanner;
import dpstrategy.RemovePumpkins;

/**
 *
 * @author faiya
 */
public class AllFacade {

    MainJFrame mj;
    GhostCaller kidgcaller;
    GhostCaller bigscarygcaller;
    Ghost bigghost;
    Ghost scaryghost;
    Ghost kidghost;
    GroundAccessories candleLights;
    TreeAccessories mylamps;
    Animal blackcat;
    GroundAccessories cfire;
    TreeAccessories pumpkin;
    Animal bats;
    TreeAccessories mybanner;

    public AllFacade(MainJFrame mj, GhostCaller kidgcaller, GhostCaller bigscarygcaller, GroundAccessories candleLights,
            TreeAccessories mylamps, Animal blackcat, GroundAccessories cfire,
            TreeAccessories pumpkin, Animal bats, TreeAccessories mybanner) {
        this.mj = mj;
        this.candleLights = candleLights;
        this.mylamps = mylamps;
        this.blackcat = blackcat;
        this.cfire = cfire;
        this.pumpkin = pumpkin;
        this.bats = bats;
        this.mybanner = mybanner;
        bigghost = bigscarygcaller.getGhost("big");
        scaryghost = bigscarygcaller.getGhost("scary");
        kidghost = kidgcaller.getGhost("kid");
    }

    public void turnAllOn() {
        bigghost.appear();
        scaryghost.appear();
        kidghost.appear();
        
        candleLights.set();
        
        mylamps.performAccessorize();
        
        mj.getCat().setIcon(blackcat.appear());
        mj.getCat().setVisible(true);
        mj.getCat().revalidate();
        
        cfire.set();
        
        pumpkin.performAccessorize();
        
        mj.getBat().setIcon(bats.appear());
        mj.getBat().setVisible(true);
        mj.getBat().revalidate();
        
        mybanner.performAccessorize();

    }

    public void turnAllOff() {
        bigghost.disappear();
        scaryghost.disappear();
        kidghost.disappear();
        
        candleLights.remove();
        
        mylamps.setAccBehavior(new RemoveLamps(mj));
        mylamps.performAccessorize();
        
        mj.getCat().setIcon(blackcat.disappear());
        mj.getCat().setVisible(true);
        mj.getCat().revalidate();
        
        cfire.remove();
        
        pumpkin.setAccBehavior(new RemovePumpkins(mj));
        pumpkin.performAccessorize();
        
        mj.getBat().setIcon(bats.disappear());
        mj.getBat().setVisible(true);
        mj.getBat().revalidate();
        
        mybanner.setAccBehavior(new RemoveBanner(mj));
        mybanner.performAccessorize();
    }
}
