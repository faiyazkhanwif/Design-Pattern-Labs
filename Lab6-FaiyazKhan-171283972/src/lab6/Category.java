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
public class Category {

    private HashMap items;
    private String desc;

    public Category(String desc) {
        this.desc = desc;
        this.items = new HashMap();
    }

    public String getDesc() {
        return desc;
    }

    public void addItem(Item item) {
        items.put(this, item);
    }

    public void deleteItem() {
        items.remove(this);
    }

    @Override
    public String toString() {
        return desc;
    }
    
    

}
