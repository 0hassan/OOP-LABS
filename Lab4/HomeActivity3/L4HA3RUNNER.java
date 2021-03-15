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
public class L4HA3RUNNER {
    public static void main(String[]arg){
        Student s1=new Student();
        Student s2=new Student();
        int[] marks={54,56,53,67,65};
        s2.putmarksName(marks,"Hassan");
        int averageS1=s1.Average();
        int averageS2=s2.Average();
        if(averageS1>averageS2)
            System.out.println("S1'S AVERAGE MARKS ARE GREATER");
        else
            System.out.println("s2's marks are greater");
        
    }
}
