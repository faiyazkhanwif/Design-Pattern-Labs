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
public class Customer {
    public static final String US = "US";
    public static final String CANADA= "Canada";
    private String address;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }
    private String name;
    private String zip, state, type;

    public Customer(String address, String name, String zip, String state, String type) {
        this.address = address;
        this.name = name;
        this.zip = zip;
        this.state = state;
        this.type = type;
    }
    
    public boolean isValidAddress(){
        AddressValidator validator = getValidator(type);
        return validator.isValidAddress(address, zip, state);
    }
    
    private AddressValidator getValidator (String custType){
        AddressValidator validator = null;
        if(custType.equals(Customer.US)){
            validator = new USAddress();
        }
        else if(custType.equals(Customer.CANADA)){
            CAAddress cad = new CAAddress();
            validator = new CAAddressAdapter();
        }
        return validator;
    }
}
