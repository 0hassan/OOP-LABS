/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_lab8.Q_2;


/**
 *
 * @author tahir
 */
public class Lab8Runner2 {
    public static void main(String[]arg){
        Laptop laptop1=new Laptop();
        Laptop laptop2=new Laptop(7, 15, 2, 1600, 8, 8000, 256000, 3.5);
        Laptop laptop3=new Laptop(6, 14, 1, 1400, 7, 12000, 512000, 4.0);
        Laptop laptop4=new Laptop();
        laptop4.height=3;
        laptop4.length=13;
        laptop4.memorySize=10000;
        laptop4.speed=2.0;
        laptop4.storageSize=1024000;
        laptop4.weight=1800;
        laptop4.width=15;
        laptop4.wordSize=16;
        
        System.out.println("------<laptop.1>------");
        laptop1.Display();
        System.out.println("------<laptop.2>------");
        laptop2.Display();
        System.out.println("------<laptop.3>------");
        laptop3.Display();
        System.out.println("------<laptop.4>------");
        laptop4.Display();
    }
}
