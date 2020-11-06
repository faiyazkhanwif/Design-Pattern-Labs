/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171283972.lab4b;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class UIToolkitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        while (flag == 0) {
            WidgetClient wc = new WidgetClient();
            System.out.println("Type 1 for Motif, 2 for Presentation Manager, 3 to exit:");
            int n = in.nextInt();
            if (n == 1) {
                wc.createWidget(n);
            } else if (n == 2) {
                wc.createWidget(n);
            } else if (n == 3) {
                flag = 3;
            } else {
                System.out.println("Invalid choice. Try again");
            }
        }

    }

}
