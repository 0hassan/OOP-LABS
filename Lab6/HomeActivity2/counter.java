/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author tahir
 */
public class counter {
    public static int constructed;
    public static int destructed;
    public int data;
    
    public counter(){
        data=++constructed;
    }
    
}
