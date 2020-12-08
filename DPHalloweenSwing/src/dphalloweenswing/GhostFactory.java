/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

//Used for Simple Factory.

/**
 *
 * @author faiya
 */
public class GhostFactory {
    MainJFrame mj;
    public GhostFactory(MainJFrame mj) {
        this.mj = mj;
    }
    
    public Ghost getGhost(String ghostType) {
        if (ghostType == "kid") {
            return new KidGhost(mj);
        } else if (ghostType == "big") {
            return new BigGhost(mj);
        } else {
            return new ScaryGhost(mj);
        }
    }
}
