/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeactivity;

/**
 *
 * @author cui
 */
public class student {
    public String Studentname;
    public String session;
    public int yearofadmission;
    public String campus;
    public String digree;
    public int rollno;
    public void regnogenerator(){
        int year;
        
        year=yearofadmission%100;
        if(session=="spring"||session=="Spring"||session=="SPRING"){
            System.out.print("your id is:");
            System.out.println("SP"+year+"-BS"+digree+"-"+rollno);}
        else{
            System.out.print("your id is:");
            System.out.println("FA"+year+"-BS"+digree+"-"+rollno);}
        
        
    }
    public void portalidgenerator(){
        int year;
        year=yearofadmission%100;
        if(session=="spring"||session=="Spring"||session=="SPRING"){
            System.out.print("reg #:");
            System.out.println("SP"+year+"-BS"+digree+"-"+rollno);}
        else{
            System.out.print("reg #:");
            System.out.println("FA"+year+"-BS"+digree+"-"+rollno);}
        System.out.println("pasword is: comsats123456");
    }
}
