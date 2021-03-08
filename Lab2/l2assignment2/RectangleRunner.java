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
public class RectangleRunner {
    public static void main(String[]arg){
        Rectangle r1,r2;
        r1=new Rectangle();
        r2=new Rectangle();
        r1.hieght=12;
        r1.width=19;
        r2.hieght=7;
        r2.width=10;
        r1.area();
        r1.perimeter();
        r2.show_data();
    }
}
