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
public class PMWidgetFactory implements AbstractWidgetFactory {

    @Override
    public ScrollBar createScrollbar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }

}
