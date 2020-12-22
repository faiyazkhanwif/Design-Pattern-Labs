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
public class TransactionFeeState extends State {

    public TransactionFeeState(BusinessAccount ba) {
        this.ba = ba;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
        super.withdraw(amount);
        double balance = ba.getBalance();
        balance = balance - BusinessAccount.TRANS_FEE_NORMAL;
        ba.setBalance(balance);
        System.out.println("An amount " + amount + " is withdrawn ");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Transaction Fee ($2.0)was charged due to account status (less than minimum balance)");
        super.deposit(amount);
        double balance = ba.getBalance();
        balance = balance - BusinessAccount.TRANS_FEE_NORMAL;
        ba.setBalance(balance);
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
