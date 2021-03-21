/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author tahir
 */
public class L5HA1Runner {
    public static void main(String[]arg){
        Distance d1=new Distance();
        Distance d2=new Distance(5,5);
        Distance d3=new Distance(7,7);
        Distance d4=d1.add(d2, d3);
        d4.display();
        
    }
}
