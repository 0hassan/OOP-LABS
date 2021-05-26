
package asssignment;
/**
 *
 * @author tahir
 */
public class shapeAreas {
    private double areas[]=new double[50];
    
    public void calculateArea(Object obj[]){
        int i=0;
        while (obj[i]!=null){
            if(obj[i] instanceof Rectangle){
                Rectangle ob= (Rectangle)obj[i];
                areas[i]=ob.area();
            }
            else if(obj[i] instanceof Triangle){
                Triangle ob= (Triangle)obj[i];
                areas[i]=ob.area();
            }
            else if(obj[i] instanceof Circle){
                Circle ob= (Circle)obj[i];
                areas[i]=ob.area();
            }
            System.out.println(areas[i]);
            i++;
        }
    } 
}
