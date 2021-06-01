package withoutArrayList;

/**
 *
 * @author tahir
 */
import java.util.Scanner;
public class Teacher extends Person implements Association {

    // properties
    private String department, designation;

    // constructurs
    public Teacher() {

    }

    public Teacher(String name, int id) {
        super(name, id);
    }

    // getter & setters 
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }
    
    //functions OR methods
    @Override
    public void association() {

        Scanner scan=new Scanner(System.in);
        System.out.print("Your Department   ?");
        this.department=scan.next();
        System.out.print("Your Designation   ?");
        this.designation=scan.next();
    }

    @Override
    public String toString() {
        return super.toString()+", Designation: "+designation+", Department: "+department;
    }
}
