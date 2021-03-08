/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOMEACTIVITY2;

/**
 *
 * @author cui
 */
public class time {
    public int minutes;
    public int seconds;
    public int hours;
    public void display(){
        System.out.println("TIME IS:-");
        System.out.println("         "+hours+":"+minutes+":"+seconds);
    }
}
