/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssignment;

/**
 *
 * @author tahir
 */
public class Circle implements shape {

    private int radius;

    public Circle() {
        radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public double area() {
        return 2 * 3.1415 * this.radius * this.radius;
    }

}
