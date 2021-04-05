/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity3;

/**
 *
 * @author tahir
 */
public class ABCD {
    public static int i ;
    public String s;
    
public static void displayStatic(){ //Static method
    System.out.println("i:"+i);
}
public void display(){ //non static method
    System.out.println("i:"+i);
    System.out.println("s:"+s);
}
}
