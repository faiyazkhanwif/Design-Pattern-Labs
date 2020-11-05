/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171283972.lab4;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author faiya
 */
public class LoggerFactory {

    public boolean isFileLoggingEnabled() {
        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            String fileLoggingValue = p.getProperty("FileLogging");
            if (fileLoggingValue.equalsIgnoreCase("ON") == true) {
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            return false;
        }
    }

    public Logger getLogger() {
        if (isFileLoggingEnabled() == true) {
            FileLoggerSingleton fl = FileLoggerSingleton.getInstance();
            return fl;
        } else{
            return new ConsoleLogger();
        }
    }
}
