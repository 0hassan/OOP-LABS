package Assignment_4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressBook implements Serializable {

    private ArrayList<Address> contacts = new ArrayList<>();
// constructor
    public AddressBook()  { }

// reading file and writing data on ArrayList
    void Read(){
        try {
            try {
                contacts=(ArrayList<Address>)Object_IO.ReadFile();
//              System.out.println(contacts.size());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EOFException ex) {
                Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// adding new Address to ArrayList
    public void addContact(Address address) throws IOException {
        contacts.add(address); 
    }

//Search on basis of Contact Number
    public Address searchContact(String cNumber)throws IOException, NullPointerException {
        Address temp = null;
        int i=0;
        try{
        temp = (Address) contacts.get(i);
        i++;
        while(!cNumber.equals(temp.getPhoneNumber()) && i<contacts.size()){
            temp = (Address) contacts.get(i);
            i++;
        }
        if(cNumber.equals(temp.getPhoneNumber()))
            return temp;
        else
            return null;
        }catch(NullPointerException e){
            
            return null;
        }
}
// deleting contact on basis of contact number
    boolean deleteContact(String cNumber) {
        Address temp;
        try {
            temp = searchContact(cNumber);
            return contacts.remove(temp);
        } catch (IOException ex) {
            Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NullPointerException ex) {
            Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
// updating the File changes will occour in File
    void updateContact() {
        try {
            Object_IO.AddObject(contacts); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(AddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// showing all addresses on screen 
    void DisplayDirectory(){
        
        for(int i=0; i<contacts.size();i++){
            contacts.get(i).Display();
            System.out.println("<||----+----+----+----+----||>");
        }
    }
    
}
