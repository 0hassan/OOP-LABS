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
public class runner {
    public static void main(String[]arg){
        Circle c1=new Circle();
        c1.radius=4;
        Circle c2=new Circle(5,3.145);
        c1.calculateCircumference();
        c2.calculateCircumference();
    }
}
