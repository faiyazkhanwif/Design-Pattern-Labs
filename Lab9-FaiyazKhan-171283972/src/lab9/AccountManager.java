/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class AccountManager {

    public static void main(String[] args) {
        String accountNumber = "1111 2222 3333 4444";
        BusinessAccount ba = new BusinessAccount(accountNumber);

        Scanner in = new Scanner(System.in);
        boolean exitswitch = false;
        while (exitswitch == false) {
            System.out.print("Enter 1 to display account, 2 to deposit, 3 to withdraw, 0 to exit: ");
            int x = in.nextInt();
            if (x == 1) {
                System.out.print("Account number = 1111 2222 3333 4444, ");
                System.out.println("Balance = " + ba.getBalance());
            } else if (x == 2) {
                System.out.print("Enter amount to deposit: ");
                double depo = in.nextInt();
                ba.deposit(depo);
                System.out.print("Account number = 1111 2222 3333 4444, ");
                System.out.println("Balance = " + ba.getBalance());
            } else if (x == 3) {
                System.out.print("Enter amount to withdraw: ");
                double wdraw = in.nextInt();
                ba.withdraw(wdraw);
                System.out.print("Account number = 1111 2222 3333 4444, ");
                System.out.println("Balance = " + ba.getBalance());
            } else if (x == 0) {
                exitswitch = true;
            }else{
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
