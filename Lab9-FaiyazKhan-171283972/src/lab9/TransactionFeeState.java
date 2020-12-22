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
public class TransactionFeeState implements State {

    BusinessAccount ba;

    public TransactionFeeState(BusinessAccount ba) {
        this.ba = ba;
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = this.ba.getBalance();
        currentBalance = currentBalance - amount - BusinessAccount.TRANS_FEE_NORMAL;
        this.ba.setBalance(currentBalance);
        System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
        transitionState(currentBalance);
        System.out.println("An amount " + amount + " is withdrawn ");
    }

    @Override
    public void deposit(double amount) {
        double currentBalance = this.ba.getBalance();
        currentBalance = currentBalance + amount - BusinessAccount.TRANS_FEE_NORMAL;
        this.ba.setBalance(currentBalance);
        
        System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
        transitionState(currentBalance);
        System.out.println("An amount " + amount + " is deposited ");
        
    }

    @Override
    public void transitionState(double balance) {
        if (balance < 0) {
            ba.setState(new OverDrawnState(ba));
            System.out.println("Attention: Your Account is Overdrawn");
        } else if (balance > BusinessAccount.MIN_BALANCE) {
            ba.setState(new NoTransactionFeeState(ba));
        }
    }

}
