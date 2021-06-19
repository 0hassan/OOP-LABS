package Assignment_4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    static AddressBook Book = new AddressBook();
    static Address temp;
    static File f;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        f = new File("AddressBook.hex");
//checking if file already exist or not
        if (f.length() == 0) {
            System.out.println("Creating New Address Book : ");
            NewFile();
        }
        Scanner scan = new Scanner(System.in);
        int check = 1;
//Reading the file and storing data in ArrayList
        Book.Read();
        
//menue card  
        while (check != 0) {
            System.out.println("1:   Add New Contact\n2:   UpDate Contact\n3:   "
                    + "Delete Contact\n4:   Search Contact\n"
                    + "5:   Display Directory\n0:   For Exit Press Zero");
            System.out.print("Press The Key According To Your Chooise :    ");
            check = scan.nextInt();

            System.out.println("\n<||----+----+----+----+----||>");
            switch (check) {
//Adding New Address To File
                
                case 1:
                    System.out.print("First Name     :    ");
                    String fname = scan.next();
                    System.out.print("Last Name      :    ");
                    String lname = scan.next();
                    System.out.print("Contact Number :    ");
                    String contact = scan.next();
                    System.out.print("Address        :    ");
                    String addres = scan.next();
//Searching if contact Already Exist
                    temp = Book.searchContact(contact);
//if contact number match it will retuern address else it will return "null"
                    if (temp != null) {
                        if (temp.getFirstName().equalsIgnoreCase(fname) && temp.getLastName().equalsIgnoreCase(lname)) {
                            System.out.println("Contact Already exists");
                        }else{
                            temp = new Address(fname, lname, contact, addres);
                            Book.addContact(temp);
                            System.out.println("Contact Added\n");
                        }
// contact number not match to already existed addresses it will add new address to address book
                    } else {
                        temp = new Address(fname, lname, contact, addres);
                        Book.addContact(temp);
                        System.out.println("Contact Added\n");
                    }
                    System.out.println("<||----+----+----+----+----||>");
                    break;
// updating address
                case 2:
                    System.out.print("Phone Number of the Address You wana Update:    ");
//checking is contact exists we want to update
                    temp = Book.searchContact(scan.next());
                    if (temp != null) {
                        System.out.print("Contact Number :    ");
                        temp.setPhoneNumber(scan.next());
                        System.out.print("Address        :    ");
                        temp.setAddress(scan.next());

                        System.out.println("Successfuly Updated\n");

                        System.out.println("<||----+----+----+----+----||>");
//if contact does not exist it will print a message on screen "Address Does Not Exist:"
                    } else {
                        System.out.println("Address Does Not Exist:");
                        System.out.println("<||----+----+----+----+----||>");
                    }
                    break;

                case 3:
// deleting contact
                    System.out.print("Contact Number :    ");
                    String cNumber = scan.next();
                    if (Book.deleteContact(cNumber)) {
                        System.out.println("Successfuly Deleted\n");
                    } else {
                        System.out.println("Address Not Found \n");
                    }
                    System.out.println("<||----+----+----+----+----||>");

                    break;
// searching contact from ArrayList
                case 4:
                    System.out.print("Contact Number :    ");
                    temp = Book.searchContact(scan.next());
// checking if temp equals null mean contact does not exists
                    if (temp != null) {
                        temp.Display();
                    } else {
                        System.out.println("Address Does Not Exist\n");
                    }
                    System.out.println("<||----+----+----+----+----||>");
                    break;
//displaying whole directory
                case 5:
                    Book.DisplayDirectory();
                    break;
                default:
                    break;
            }
// here is main part when program shut down All data will be stored on the
// File using ObjectOutputStream
            Book.updateContact();

        }
    }

// agar pehli bar book exist nahi karti to ye blook 10 contacts Default 
// toor par add kar dy ga.
    static void NewFile() throws IOException {
        for (int i = 0; i < 10; i++) {
// dumy adresses on file
            temp = new Address("hassan", ("Khan" + i), ("030" + i),
                    ("Mohallah_Alam_Khan_Kheal" + i));
            Book.addContact(temp);
        }
        Book.updateContact();
    }
}
