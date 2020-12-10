/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

//Used for Factory method pattern.
/**
 *
 * @author faiya
 */
public class KidGhostCaller extends GhostCaller {

    public KidGhostCaller(MainJFrame mj) {
        super(mj);
    }

    @Override
    Ghost getGhost(String ghostType) {
        if (ghostType == "kid") {
            return new KidGhost(mj);

        } else {
            return null;
        }
    }
}
