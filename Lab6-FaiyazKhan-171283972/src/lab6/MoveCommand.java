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
public class MoveCommand implements Command {

    Item item;
    Category categoryold;
    Category categorynew;

    public MoveCommand(Item item, Category categoryold, Category categorynew) {
        this.item = item;
        this.categoryold = categoryold;
        this.categorynew = categorynew;
    }

    @Override
    public void execute() {
        System.out.println("Move the item from the " + categoryold + " category to " + categorynew + " category");

        item.deleteCategory(categoryold);
        categoryold.deleteItem();
        System.out.println("Item '" + item.getDesc() + "' has been deleted from the " + "'" + categoryold.getDesc() + "' Category");

        item.addCategory(categorynew);
        categorynew.addItem(item);
        System.out.println("Item '" + item.getDesc() + "' has been added to the " + "'" + categorynew.getDesc() + "' Category");

    }

}
