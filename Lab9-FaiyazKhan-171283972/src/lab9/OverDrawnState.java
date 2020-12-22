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
public class OverDrawnState implements State {

    BusinessAccount ba;

    public OverDrawnState(BusinessAccount ba) {
        this.ba = ba;
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = this.ba.getBalance();
        if (ba.getBalance() - amount > BusinessAccount.OVERDRAW_LIMIT) {
            currentBalance = currentBalance - amount - BusinessAccount.TRANS_FEE_OVERDRAW;
            this.ba.setBalance(currentBalance);
            System.out.println("Transaction Fee ($5.0)was charged due to account status(Overdrawn)");
            transitionState(currentBalance);
            System.out.println("An amount " + amount + " is withdrawn ");
        } else {
            System.out.println(BusinessAccount.ERR_OVERDRAW_LIMIT_EXCEED);
        }
    }

    @Override
    public void deposit(double amount) {
        double currentBalance = this.ba.getBalance();
        currentBalance = currentBalance + amount - ba.TRANS_FEE_OVERDRAW;
        this.ba.setBalance(currentBalance);
        System.out.println("Transaction Fee ($5.0)was charged due to account status(Overdrawn)");
        transitionState(currentBalance);
        System.out.println("An amount " + amount + " is deposited ");

    }

    @Override
    public void transitionState(double balance) {
        if (balance > 0 && balance < BusinessAccount.MIN_BALANCE) {
            ba.setState(new TransactionFeeState(ba));
        } else if (balance > BusinessAccount.MIN_BALANCE) {
            ba.setState(new NoTransactionFeeState(ba));
        }
    }

}
