/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2assignment2;

/**
 *
 * @author tahir
 */
public class Rectangle {
    int hieght, width;
    public void area(){
        System.out.println("Area of rectangle is: "+hieght*width);
    }
    public void perimeter(){
        System.out.println("Perimeter of the this rectangle is: "+2*(hieght+width));
    }
    public void show_data(){
        System.out.println("Area of rectangle is: "+hieght*width);
        System.out.println("Perimeter of the this rectangle is: "+2*(hieght+width));
        System.out.println("Number of vertices: 4");
        System.out.println("Number of edges: 4");
        System.out.println("Internal angle: 90°");
    }
    
}
