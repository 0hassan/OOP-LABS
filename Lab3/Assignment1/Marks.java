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
public class Marks {
    int english, urdu, math;
    
    public Marks(){
        english=10;
        urdu=10;
        math=10;
    }
    public Marks(int eng, int ur, int ma){
        english=eng;
        urdu=ur;
        math=ma;
        
    }
    public void sum(){
        int total=english+urdu+math;
        System.out.println("your total marks are "+total);
    }
}
