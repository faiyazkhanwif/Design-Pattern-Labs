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
public class AirCraft extends Vehicle {

    public AirCraft() {
        movebehavior = new MoveInAir();
    }
    
    @Override
    public void display() {
        System.out.print("I am an AirCraft. ");
    }
    
}
