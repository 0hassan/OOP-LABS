/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2a2;

/**
 *
 * @author cui
 */
public class Datademo {
    public static void main(String[]arg){
        Data date1,date2;
        date1 =new Data();
        date1.day=31;
        date1.month="December";
        date1.year=2021;
        System.out.println("date1:");
        date1.display();
        
        date2 =new Data();
        date2.day=3;
        date2.month="December";
        date2.year=2029;
        System.out.println("date2:");
        date2.display();
    }
}
