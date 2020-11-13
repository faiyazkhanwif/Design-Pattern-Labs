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
public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log(makeHTML(msg));
    }

    public String makeHTML(String msg) {
        return "<HTML><BODY><b>" + msg + "</b></BODY></HTML>";
    }

}
