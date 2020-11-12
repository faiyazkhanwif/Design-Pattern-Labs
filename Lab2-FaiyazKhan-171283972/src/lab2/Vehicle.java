/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author faiya
 */
public abstract class Vehicle {

    MoveBehavior movebehavior;

    public abstract void display();

    public void performmove() {
        movebehavior.move();
    }

    public void setMoveBehavior(MoveBehavior mb) {
        movebehavior = mb;
    }
}
