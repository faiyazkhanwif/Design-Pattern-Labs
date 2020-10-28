/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3;

/**
 *
 * @author faiya
 */
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory sp = new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(sp);
        ps.orderPizza("cheese");
        System.out.println("");
        ps.orderPizza("veggie");
    }
}
