/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;

/**
 *
 * @author tahir
 */
public class Distance {
    int feet, inches;
    String name;
     public Distance(){
         feet=5;
         inches=10;
     }
     public Distance(int f, int inch){
         feet=f;
         inches=inch;
     }
     public void displayinfo(){
         System.out.println(name+" you have travelled "+feet+" Feet and "+inches+" Inches.");
     }
}
