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
public abstract class LoggerDecorator implements Logger{
    public Logger logger;
    @Override
    public abstract void log(String msg);
}
