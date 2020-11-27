/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class Item {

    private HashMap categories;
    private String desc;

    public Item(String desc) {
        this.desc = desc;
        this.categories = new HashMap();
    }

    public String getDesc() {
        return desc;
    }
    
    public void addCategory(Category category) {
        categories.put(category, this);
    }

    public void deleteCategory(Category category) {
        categories.remove(category);
    }
    
    public void displayCategories(){
        System.out.println("Item '"+this.desc+"' belongs to these categories: "+categories.keySet().toString());
    }

}
