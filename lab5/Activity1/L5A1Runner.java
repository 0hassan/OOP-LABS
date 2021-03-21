/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author tahir
 */
public class L5A1Runner {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        ObjectPass.increment(p);
        System.out.println("After calling: " + p.value);


    }
}
