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

import java.util.Scanner;
public class Car {
    int model, numofseats, hpower;
    String price;
    String brand, color;
    public void showinformation(){ 
        System.out.println("Model # is: "+model);
        System.out.println("Horse power Speed: "+hpower);
        System.out.println("Made by: "+brand);
        System.out.println("Color of the Car is: "+color);
        System.out.println("Price: "+price);
    
}
    public void chose(){
        System.out.println("which car you want 2 seater of 4 : ????");
        Scanner s=new Scanner(System.in);
        int numofseat=s.nextInt();
        numofseats=numofseat;
        System.out.println("your order is comfirmed for "+numofseat+" seater car.");
    }
    
}
