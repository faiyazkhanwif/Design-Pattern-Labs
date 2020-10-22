/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class VehicleSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vehicle sr = new StreetRacer();
        Vehicle fo = new FormulaOne();
        Vehicle ar = new AirCraft();
        int x = 0;
        while (x != 1) {
            System.out.println("Type 1 for StreetRacer, 2 for FormulaOne, 3 for AirCraft, 4 to exit: ");
            int n = in.nextInt();
            boolean first = true;
            while (n == 1) {
                if (first == true) {
                    sr.display();
                    sr.performmove();
                }
                System.out.println("    Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior:");
                int m = in.nextInt();
                if (m == 1) {
                    sr.display();
                    sr.performmove();
                    first = false;
                } else if (m == 2) {
                    sr.display();
                    System.out.println("I cannot fly.");
                    first = false;
                } else if (m == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice of moving behavior. Try again");
                    first = false;
                }
            }
            while (n == 2) {
                if (first == true) {
                    fo.display();
                    fo.performmove();
                }
                System.out.println("    Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior:");
                int m = in.nextInt();
                if (m == 1) {
                    fo.display();
                    fo.performmove();
                    first = false;
                } else if (m == 2) {
                    fo.display();
                    System.out.println("I cannot fly.");
                    first = false;
                } else if (m == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice of moving behavior. Try again");
                    first = false;
                }
            }
            while (n == 3) {
                if (first == true) {
                    ar.display();
                    ar.performmove();
                }
                System.out.println("    Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior:");
                int m = in.nextInt();
                if (m == 1) {
                    ar.setMoveBehavior(new MoveOnGround());
                    ar.display();
                    ar.performmove();
                    first = false;
                } else if (m == 2) {
                    ar.setMoveBehavior(new MoveInAir());
                    ar.display();
                    ar.performmove();
                    first = false;
                } else if (m == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice of moving behavior. Try again");
                    first = false;
                }
            }
            if (n == 4) {
                x = 1;
            }else if (n > 4 || n<0) {
                System.out.println(n);
                System.out.println("Invalid choice of type of vehicle. Try again");
            }
        }

    }
}
