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
public class CAAddressAdapter extends CAAddress implements AddressValidator {
    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return isValidCanadianAddress(inp_address, inp_zip, inp_state);
    }
}
