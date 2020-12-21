/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
/**
 *
 * @author faiya
 */
public class Visa extends Card{

    public Visa(String cardType, String cardNumber, int expMonth, int expYear) {
        super(cardType, cardNumber, expMonth, expYear);
    }

    @Override
    protected boolean isLengthValid() {
        String msg = "Card Length";
        boolean valid;
        int length = cardNumber.length();
        
        valid = length==13||length==16;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isPrefixValid() {
        String msg = "Prefix";
        boolean valid;
        int num = Integer.parseInt(cardNumber.substring(0, 1));
        
        valid=num==4;
        
        if(!valid)   printInvalid(msg);
        
        return valid;
    }

    @Override
    protected boolean isGoodStanding() {
        return true;
    }

}
