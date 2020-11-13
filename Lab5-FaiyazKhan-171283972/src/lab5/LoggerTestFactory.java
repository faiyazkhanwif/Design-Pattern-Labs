/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author faiya
 */
public class LoggerTestFactory {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dt = sf.format(date);
        
        LoggerFactory factory = new LoggerFactory();
        
        Logger lg = new HTMLLogger(factory.getLogger());
        lg.log(dt+": "+"hello, how are you?");
        
        Logger lg2 = new EncryptLogger(factory.getLogger());
        lg2.log(dt+": "+"hello, how are you?");
        
        Logger lg3 = new EncryptLogger(lg);
        lg3.log("Good Bye");
    }
}
