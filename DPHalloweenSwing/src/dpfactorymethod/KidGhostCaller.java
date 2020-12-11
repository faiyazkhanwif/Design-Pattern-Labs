/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpfactorymethod;

//Used for Factory method pattern.

import main.MainJFrame;
import dpfactorymethod.KidGhost;
import dpfactorymethod.GhostCaller;
import dpfactorymethod.Ghost;

/**
 *
 * @author faiya
 */
public class KidGhostCaller extends GhostCaller {

    public KidGhostCaller(MainJFrame mj) {
        super(mj);
    }

    @Override
    public Ghost getGhost(String ghostType) {
        if (ghostType == "kid") {
            return new KidGhost(mj);

        } else {
            return null;
        }
    }
}
