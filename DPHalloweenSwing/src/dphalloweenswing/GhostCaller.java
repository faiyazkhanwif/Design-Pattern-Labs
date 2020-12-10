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
public abstract class GhostCaller {

    MainJFrame mj;

    public GhostCaller(MainJFrame mj) {
        this.mj = mj;
    }

    public Ghost callGhost(String ghostType) {
        Ghost ghost;
        ghost = getGhost(ghostType);
        return ghost;
    }
    
//Factory Method
    abstract Ghost getGhost(String ghostType);
}
