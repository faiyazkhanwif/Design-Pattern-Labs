/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171283972.lab4b;

/**
 *
 * @author faiya
 */
public class WidgetClient {

    AbstractWidgetFactory aw;
    Window window;
    ScrollBar scrollbar;

    public void createWidget(int n) {
        if (n == 1) {
            aw = new MotifWidgetFactory();
        } else {
            aw = new PMWidgetFactory();
        }
        window = aw.createWindow();
        window.setTitle("New Window");
        scrollbar = aw.createScrollbar();
        scrollbar.setDirection();

    }
}
