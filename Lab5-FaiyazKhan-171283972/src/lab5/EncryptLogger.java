/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author faiya
 */
public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log(DoEncryption(msg));
    }

    public String DoEncryption(String msg) {
        String str = msg;
        char tempch = str.charAt(str.length() - 1);
        String temp = Character.toString(tempch);
        str = temp + str.substring(0, str.length() - 1);
        return str;
    }

}
