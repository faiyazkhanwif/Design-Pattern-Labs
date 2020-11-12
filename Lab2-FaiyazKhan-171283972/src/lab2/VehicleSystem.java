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

    public static void systemworking(int n, boolean first, Vehicle vh, Scanner in) {
        while (n != 4) {
            if (first == true) {
                vh.display();
                vh.performmove();
            }
            System.out.println("    Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior:");
            int m = in.nextInt();
            if (m == 1) {
                if (n == 1 || n == 2) {
                    vh.display();
                    vh.performmove();
                } else {
                    vh.setMoveBehavior(new MoveOnGround());
                    vh.display();
                    vh.performmove();
                }
                first = false;
            } else if (m == 2) {
                if (n == 1 || n == 2) {
                    vh.display();
                    System.out.println("I cannot fly.");
                } else {
                    vh.setMoveBehavior(new MoveInAir());
                    vh.display();
                    vh.performmove();
                }
                first = false;
            } else if (m == 3) {
                break;
            } else {
                System.out.println("Invalid choice of moving behavior. Try again");
                first = false;
            }
        }
    }

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
            if (n == 1) {
                systemworking(n, first, sr, in);
            } else if (n == 2) {
                systemworking(n, first, fo, in);
            } else if (n == 3) {
                systemworking(n, first, ar, in);
            } else if (n == 4) {
                x = 1;
            } else {
                System.out.println("Invalid choice of type of vehicle. Try again");
            }
        }

    }
}
