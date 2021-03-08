/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author tahir
 */
public class runner {
    public static void main(String[]arg){
        Marks std1=new Marks();
        Marks std2=new Marks(50,60,70);
        std1.sum();
        std2.sum();
    }
}
