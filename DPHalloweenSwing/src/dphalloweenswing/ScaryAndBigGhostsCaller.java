/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

//Used for Factory method patter.
/**
 *
 * @author faiya
 */
public class ScaryAndBigGhostsCaller extends GhostCaller {

    public ScaryAndBigGhostsCaller(MainJFrame mj) {
        super(mj);
    }

    @Override
    Ghost getGhost(String ghostType) {
        if (ghostType == "big") {
            return new BigGhost(mj);
        } else if (ghostType == "scary") {
            return new ScaryGhost(mj);
        } else {
            return null;
        }
    }

}
