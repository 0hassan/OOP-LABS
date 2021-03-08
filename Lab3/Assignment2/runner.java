/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
/**
 *
 * @author tahir
 */
public class runner {
    public static void main(String[]arg){
        Time t=new Time();
        t.hr=5;
        t.min=34;
        t.sec=15;
        Time t1=new Time(12,34,45);
        t.showTime();
        t1.showTime();
    }
}
