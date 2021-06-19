package Assignment_4;

/**
 *
 * @author tahir
 */
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Object_IO {

    private static ObjectInputStream read;
    private static ObjectOutputStream add;
// to write on file
    public static void AddObject(ArrayList<Address> obj) throws IOException {
        try {
            add = new ObjectOutputStream(new FileOutputStream("AddressBook.hex"));
            for (int i = 0; i < obj.size(); i++) {
                add.writeObject(obj.get(i));
            }
            add.flush();
            add.close();
        } catch (IOException ex) {

        }
    }
// to read from the file
    static ArrayList<Address> ReadFile() throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {
        ArrayList<Address> Obj = new ArrayList();
        Address temp = null;
        try {
            ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("AddressBook.hex"));
            while (true) {
                temp = (Address) ois.readObject();
//                System.out.println(temp.getPhoneNumber());
                Obj.add(temp);
            }
            

        } catch (EOFException ex) { //This exception will be caught when EOF is reached
            System.out.println("Reading Completed. End of file reached.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        

        
        return Obj;
    }
}
