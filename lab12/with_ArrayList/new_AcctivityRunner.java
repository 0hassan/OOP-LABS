package with_ArrayList;

/**
 *
 * @author tahir
 */
public class new_AcctivityRunner {

    public static void main(String[] args) {
        HumanResourse batch1 = new HumanResourse();

        batch1.addRecord("Ali", 38302, "Student");
        batch1.addRecord("Mukhtar Azeem", 38332, "Teacher");
        batch1.addRecord("Assad", 38300, "Student");

        batch1.addRecord("Sir Adnan", 38999, "Teacher");
        batch1.addRecord("Sir Saeed", 38302, "Teacher");

        batch1.deleteRecord("Assad");
        batch1.deleteRecord("Sir Adnan");
        System.out.println(batch1);

    }
}
