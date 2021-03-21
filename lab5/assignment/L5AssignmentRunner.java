/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author tahir
 */
public class L5AssignmentRunner {
    public static void main(String[]arg){
        Fraction f1=new Fraction();
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter nominator of 1st fraction.  ");
        int nominator1=scan.nextInt();
        System.out.print("Enter denominator of 1st fraction.   ");
        int denominator1=scan.nextInt();
        
        f1.setNominator(nominator1);
        f1.setDenominator(denominator1);
        
        System.out.print("Enter nominator of 2nd fraction.  ");
        int nominator2=scan.nextInt();
        System.out.print("Enter denominator of 2nd fraction.   ");
        int denominator2=scan.nextInt();
        
        Fraction f2=new Fraction(nominator2, denominator2);
        
        if(f1.equals(f2)){
            System.out.println("both fractions are identical");
            System.out.println("Fraction1 :"+f1.getNominator()+"/"+f1.getdenominator());
            System.out.println("Fraction 2 :"+f2.getNominator()+"/"+f2.getdenominator());
        }else{
            System.out.println("they are not identical");
            System.out.println("Fraction1 :"+f1.getNominator()+"/"+f1.getdenominator());
            System.out.println("Fraction 2 :"+f2.getNominator()+"/"+f2.getdenominator());
        }
    }
}
