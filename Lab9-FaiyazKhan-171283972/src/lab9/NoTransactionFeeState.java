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
public class NoTransactionFeeState extends State {

    public NoTransactionFeeState(BusinessAccount ba) {
        this.ba = ba;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("An amount " + amount + " is withdrawn ");
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("An amount " + amount + " is deposited ");
    }

    @Override
    public void transitionState(double balance) {
        if (balance > 0 && balance < BusinessAccount.MIN_BALANCE) {
            ba.setState(new TransactionFeeState(ba));
        } else if (balance < 0) {
            ba.setState(new OverDrawnState(ba));
            System.out.println("Attention: Your Account is Overdrawn");
        }
    }

}
