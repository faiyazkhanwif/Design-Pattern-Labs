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
public class ItemManager {

    Command request;

    public ItemManager() {
    }

    public void setCommand(Command command) {
        request = command;
    }

    public void RequestWasMade() {
        request.execute();
    }

}
