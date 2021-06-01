package with_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author tahir
 */
public class Person extends ArrayList{

    // properties
    private String name;
    private int id;

    // constructurs
    Person() {

    }

    Person(String name, int id) {
        this.id = id;
        this.name = name;
    }

    // setter & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // methods
    @Override
    public String toString() {
        return "Name: "+name+", IdCard Number: "+id;
    }
}
