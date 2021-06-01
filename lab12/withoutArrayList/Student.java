package withoutArrayList;

import java.util.Scanner;

/**
 *
 * @author tahir
 */
public class Student extends Person implements Association {
    // properties

    private int roll_no, semester;

    // constructurs
    Student() {

    }

    Student(String name, int id) {
        super(name, id);
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

    // setter and getters 
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    //functions OR methods
    @Override
    public void association() {

        Scanner scan=new Scanner(System.in);
        System.out.print("Your Roll no   ?");
        this.roll_no=scan.nextInt();
        System.out.print("Your Semester   ?");
        this.semester=scan.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+", Roll Number: "+roll_no+", Semester: "+semester;
    }
}
