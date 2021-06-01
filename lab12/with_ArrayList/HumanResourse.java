
package with_ArrayList;
import java.util.ArrayList;
/**
 *
 * @author tahir
 */
public class HumanResourse {
    
    ArrayList<Person> batch1 = new ArrayList<Person>(); // Create an ArrayList object 
//  we dont need to keep track of the list any more
 //  private static int indx = 0; // point last elment
    
    // Adding new records to the list
    public void addRecord( String name , int id , String status){
        
        if(status.equals("Student")){
            System.out.println("No :-   "+(batch1.size()+1));
            batch1.add(new Student(name, id));
            ((Student)batch1.get(batch1.size()-1)).association();
 //           indx++;
        }
        else if(status.equals("Teacher")){
            System.out.println("No :-   "+(batch1.size()+1));
            batch1.add(new Teacher(name, id));
            ((Teacher)batch1.get(batch1.size()-1)).association();
 //           indx++;
        }
        
    }


    @Override
    public String toString(){
        String strng="";
        for(int i=0;i<batch1.size();i++){
            strng = strng+batch1.get(i).toString()+"\n";
        }
        return strng;
    }

    public void deleteRecord(String name){
        int cheack=0,j=0;
        for(int i=0; i<batch1.size(); i++){
            if(!name.equals(((Person)batch1.get(i)).getName()) && j!=batch1.size()-1){
                
            }else{
                batch1.remove(i);
            }
            
            
        }
            
        
        
    }
    
}
