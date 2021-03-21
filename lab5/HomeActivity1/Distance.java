/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author tahir
 */
public class Distance {
    public int feet, inches;
    public Distance(){
        feet=2;
        inches=3;
        
    }
    
    public Distance(int fe,int in){
        feet=fe;
        inches=in;
        
    }
    
    public int getFeet(){
        return feet;
    }
    
    public int getInches(){
        return inches;
    }
    
    public void setter(int f,int i){
        feet=f;
        inches=i;
    }
    
    public Distance add(Distance da, Distance db){
        Distance d=new Distance(feet+da.feet+db.feet , inches+da.inches+db.inches);
        return d;
    }
    
    public void display(){
        System.out.println("feet :"+feet);
        System.out.println("inches :"+inches);
    }
}
