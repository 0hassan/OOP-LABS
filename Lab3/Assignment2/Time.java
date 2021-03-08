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
public class Time {
    int hr,min,sec;
    public Time(){
        
    }
    public Time(int h, int m, int s){
        hr = h;
        min = m;
        sec = s;
    }public void checktime(){
    if(hr>24||min>60||sec>60){
            System.out.println("Ïnvalid time");
    }
        
    }
    public void showTime(){
       checktime();
        System.out.println("Current Time is: "+hr+":"+min+":"+sec);
    }
}
