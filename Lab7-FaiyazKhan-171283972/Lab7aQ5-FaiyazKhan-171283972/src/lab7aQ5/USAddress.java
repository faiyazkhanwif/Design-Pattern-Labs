/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7aQ5;

/**
 *
 * @author faiya
 */
public class USAddress implements AddressValidator {

    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        if (inp_address.trim().length() < 10) {
            return false;
        }
        if (inp_zip.trim().length() < 5) {
            return false;
        }
        if (inp_zip.trim().length() > 10) {
            return false;
        }
        if (inp_state.trim().length() != 2) {
            return false;
        }
        return true;
    }
}
