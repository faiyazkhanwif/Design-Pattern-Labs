/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171283972.lab4;

/**
 *
 * @author faiya
 */
public class LoggerTestFactory {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger lg = factory.getLogger();
        lg.log("hello, how are you?");
    }
}
