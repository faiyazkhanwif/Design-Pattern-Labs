/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author faiya
 */
public class FileLogger implements Logger {

    @Override
    public void log(String msg) {
        File file = new File("log.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            PrintWriter wr = new PrintWriter(fw);
            wr.println(msg);
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
