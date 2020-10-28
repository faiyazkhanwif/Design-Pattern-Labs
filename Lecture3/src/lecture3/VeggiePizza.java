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
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.name = "Veggie Pizza";
        this.dough = "Crust";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Shredded Mozzarella");
        this.toppings.add("Grated Parmesan cheese");
        this.toppings.add("Diced Onion");
        this.toppings.add("Sliced mushroom");
        this.toppings.add("Sliced red pepper");
        this.toppings.add("Sliced black olives");
    }
    
}
