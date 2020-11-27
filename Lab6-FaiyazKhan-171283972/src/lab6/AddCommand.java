/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author faiya
 */
public class AddCommand implements Command{
    Item item;
    Category category;

    public AddCommand(Item item, Category category) {
        this.item = item;
        this.category = category;
    }

    @Override
    public void execute() {
        item.addCategory(category);
        category.addItem(item);
        System.out.println("Item '"+item.getDesc()+"' has been added to the "+"'"+category.getDesc()+"' Category");
    }
    
}
