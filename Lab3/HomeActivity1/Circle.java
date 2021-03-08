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
public class Circle {
    int radius;
    double pi;
    public Circle(){
        pi=3.145;
    }
    public Circle(int r, double p){
        radius =r;
        pi = p;
    }
    public void calculateCircumference(){
        System.out.println("circumference of Circle with radius "+radius+" is "+2*pi*radius);
    }
}
