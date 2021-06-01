
package withoutArrayList;
/**
 *
 * @author tahir
 */
public class HumanResourse {
    Association resourses[];

    
    private Person[] batch1;
    private static int indx = -1; // point last elment
    
    // Adding new records to the list
    public void addRecord( String name , int id , String status){
        
        if(indx!=-1){
            // if array is not empty extendIndx will be called
            extendIndx();
        }else
            batch1=new Person[1];
        indx++;
        if(status.equals("Student")){
            System.out.println("No :-   "+(indx+1));
            batch1[indx]=new Student(name , id);
            ((Student)batch1[indx]).association();
        }
        else if(status.equals("Teacher")){
            System.out.println("No :-   "+(indx+1));
            batch1[indx]=new Teacher(name , id);
            ((Teacher)batch1[indx]).association();
        }
        
    }

    private void extendIndx(){
       Person[] temp=new Person[indx+2];
       
       for(int i=0;i<=indx; i++){
           temp[i]=batch1[i];
       }
       batch1=new Person[indx+2];
       batch1=temp;
       temp=null;
    }

    @Override
    public String toString(){
        String strng="";
        for(int i=0;i<=indx;i++){
            strng = strng+batch1[i]+"\n";
        }
        return strng;
    }

    public void deleteRecord(String name){
        Person[] temp=new Person[indx];
        int cheack=0,j=0;
        for(int i=0; i<=indx; i++){
            if(!name.equals(batch1[i].getName()) && j!=indx){
                temp[j]=batch1[i];
                j++;
            }else{
                cheack=1;
            }
            
        }
        if(cheack==1){
            indx--;
            batch1=new Person[indx];
            batch1=temp;
        }
        
    }
    
}
