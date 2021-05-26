
package asssignment;

/**
 *
 * @author tahir
 */
public class ShapeRunner {
    public static void main(String []arg){
        Object objs[]=new Object[50];
        objs[0]= new Circle(3);
        objs[1]= new Triangle();
        objs[2]= new Rectangle(3,6);
        objs[3]= new Circle();
        objs[4]= new Circle(8);
        
        shapeAreas areas=new shapeAreas();
        areas.calculateArea(objs);
    }
}
