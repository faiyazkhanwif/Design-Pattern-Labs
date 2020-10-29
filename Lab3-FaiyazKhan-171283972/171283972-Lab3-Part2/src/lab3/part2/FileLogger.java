/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.part2;

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
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String log = sf.format(date);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            PrintWriter wr = new PrintWriter(fw);
            wr.println(log + ": " + msg);
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
