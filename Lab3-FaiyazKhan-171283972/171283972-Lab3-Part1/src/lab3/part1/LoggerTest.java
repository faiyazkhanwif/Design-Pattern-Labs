/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.part1;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author faiya
 */
public class LoggerTest {

    public static boolean isFileLoggingEnabled() {
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

    public static void main(String[] args) {
        if (isFileLoggingEnabled() == true) {
            Logger fl = new FileLogger();
            fl.log("Hello, how are you?");
        } else if (isFileLoggingEnabled() == false) {
            Logger cl = new ConsoleLogger();
            cl.log("Hello, how are you?");
        }
    }
}
