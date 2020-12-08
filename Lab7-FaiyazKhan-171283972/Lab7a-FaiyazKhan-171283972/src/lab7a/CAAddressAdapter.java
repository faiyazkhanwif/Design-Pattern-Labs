/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7a;

/**
 *
 * @author faiya
 */
public class CAAddressAdapter implements AddressValidator {
    private CAAddress cad;

    public CAAddressAdapter(CAAddress cad) {
        this.cad = cad;
    }
    
    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return cad.isValidCanadianAddress(inp_address, inp_zip, inp_state);
    }
}
