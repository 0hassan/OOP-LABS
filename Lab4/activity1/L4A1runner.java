/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
 *
 * @author tahir
 */
public class L4A1runner {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("―circumference of Circle 1 is ― ");
        c1.display();
        int r = c1.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.println("―circumference of Circle 2 is ― ");
        c2.display();
    }

}