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
public class CommandTest {
    public static void main(String[] args) {
        ItemManager im = new ItemManager();
        Item item = new Item("duet");
        Category category = new Category("CD");
        AddCommand add = new AddCommand(item,category);
        im.setCommand(add);
        im.RequestWasMade();
        Category category1 = new Category("New Releases");
        AddCommand add1 = new AddCommand(item,category1);
        im.setCommand(add1);
        im.RequestWasMade();
        
        item.displayCategories();

        
    }
}
