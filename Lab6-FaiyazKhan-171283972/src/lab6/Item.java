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
    private int i;

    public Item(String desc) {
        this.desc = desc;
        this.categories = new HashMap();
    }

    public String getDesc() {
        return desc;
    }
    
    public void addCategory(Category category) {
        categories.put(i, category);
        i++;
    }

    public void deleteCategory() {
        categories.remove(this);
        i--;
    }
    
    public void displayCategories(){
        System.out.print("Item '"+this.desc+"' belongs to these categories: [");
        for (int j = 0; j < this.categories.size(); j++) {
            if (j==this.categories.size()-1) {
                System.out.println(this.categories.get(j).toString()+"]");
                break;
            }
            System.out.print(this.categories.get(j).toString()+", ");
        }
    }

}
