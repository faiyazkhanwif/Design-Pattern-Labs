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
public class DeleteCommand implements Command {
    Item item;
    Category category;

    public DeleteCommand(Item item, Category category) {
        this.item = item;
        this.category = category;
    }

    @Override
    public void execute() {
        item.deleteCategory(category);
        category.deleteItem();
        System.out.println("Item '"+item.getDesc()+"' has been deleted from the "+"'"+category.getDesc()+"' Category");
    }
}
