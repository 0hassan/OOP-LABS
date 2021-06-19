package Assignment_4;

import java.io.IOException;
import java.io.Serializable;

import java.util.ArrayList;

public class Address extends AddressBook implements Serializable {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    Address() throws IOException{

    }

    Address(String firstName, String lastName, String phoneNumber, String 
            address) throws IOException {
        super();
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public void Display(){
        System.out.println("First Name     :    "+this.firstName);
        System.out.println("Last Name      :    "+this.lastName);
        System.out.println("Contact Number :    "+this.phoneNumber);
        System.out.println("Address        :    "+this.address);
    }
}
