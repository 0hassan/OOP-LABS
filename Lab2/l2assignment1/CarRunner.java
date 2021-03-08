/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2assignment1;

/**
 *
 * @author tahir
 */
public class CarRunner {
    public static void main(String[]arg){
        Car c1,c2;
        c1=new Car();
        c2=new Car();
        c1.brand="Honda";
        c1.color="black";
        c1.hpower=138;
        c1.model=20;
        c1.price="40 lack";
        c1.showinformation();
        c1.chose();
        c2.brand="bogati";
        c2.color="white";
        c2.hpower=450;
        c2.model=21;
        c2.price="40 milion";
        c2.showinformation();
        c2.chose();
        Car c3=new Car();
        c3.brand="Mehran";
        c3.color="red";
        c3.hpower=100;
        c3.model=17;
        c3.price="8 lack";
        c3.chose();
        c3.showinformation();
    }
    
}
