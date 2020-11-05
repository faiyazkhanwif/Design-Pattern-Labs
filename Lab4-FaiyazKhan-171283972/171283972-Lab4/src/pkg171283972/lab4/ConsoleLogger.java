/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171283972.lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author faiya
 */
public class ConsoleLogger implements Logger{
    
    @Override
    public void log(String msg) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String log = sf.format(date);
        System.out.println(log+": "+msg);
    }
    
}
