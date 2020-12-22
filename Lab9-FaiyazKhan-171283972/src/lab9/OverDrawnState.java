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
public class OverDrawnState extends State {

    public OverDrawnState(BusinessAccount ba) {
        this.ba = ba;
    }

    @Override
    public void withdraw(double amount) {
        if (ba.getBalance() - amount > BusinessAccount.OVERDRAW_LIMIT) {
            System.out.println("Transaction Fee ($5.0)was charged due to account status(Overdrawn)");
            super.withdraw(amount);
            double balance = ba.getBalance();
            balance = balance - BusinessAccount.TRANS_FEE_OVERDRAW;
            ba.setBalance(balance);
            System.out.println("An amount " + amount + " is withdrawn ");
        } else {
            System.out.println(BusinessAccount.ERR_OVERDRAW_LIMIT_EXCEED);
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Transaction Fee ($5.0)was charged due to account status(Overdrawn)");
        super.deposit(amount);
        double balance = ba.getBalance();
        balance = balance - BusinessAccount.TRANS_FEE_OVERDRAW;
        ba.setBalance(balance);
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
