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
public class BusinessAccount {

    public static final double MIN_BALANCE = 2000.00;
    public static final double OVERDRAW_LIMIT = -1000.00;
    public static final double TRANS_FEE_NORMAL = 2.00;
    public static final double TRANS_FEE_OVERDRAW = 5.00;
    public static final String ERR_OVERDRAW_LIMIT_EXCEED
            = "Error: Transaction cannot be processed. "
            + "Overdraw limit exceeded";
    private State objState;
    private String accountNumber;
    private double balance;

    public void setState(State newState) {
        objState = newState;
    }

    public State getState() {
        return objState;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        objState.deposit(amount);
        return true;
    }

    public boolean withdraw(double amount) {
        objState.withdraw(amount);
        return true;
    }

    public BusinessAccount(String accountNumber) {
        this.objState = new NoTransactionFeeState(this);
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
