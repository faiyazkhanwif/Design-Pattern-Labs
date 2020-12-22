/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author faiya
 */
public class State {

    BusinessAccount ba;

    public static State InitialState(BusinessAccount a) {
        return new NoTransactionFeeState(a);
    }

    public void withdraw(double amount) {
        double currentBalance = this.ba.getBalance();
        currentBalance = currentBalance - amount;
        this.ba.setBalance(currentBalance);
        transitionState(currentBalance);
    }

    public void deposit(double amount) {
        double currentBalance = this.ba.getBalance();
        currentBalance = currentBalance + amount;
        this.ba.setBalance(currentBalance);
        transitionState(currentBalance);
    }

    public void transitionState(double balance) {

    }
}
