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
public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        this.name = "Pepperoni Pizza";
        this.dough = "Crust";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Sliced pepperoni");
        this.toppings.add("Sliced onion");
        this.toppings.add("Grated Parmesan cheese");
    }

}
