/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author tahir
 */
public class Fraction {
    private int nominator;
    private int denominator;
    
    public Fraction(){
        
    }
    
    public Fraction(int nominator, int denominator){
        this.denominator=denominator;
        this.nominator=nominator;
    }
    
    public boolean equals(Fraction second){
        return(nominator==second.nominator && denominator==second.denominator);
    }
    
    public void setNominator(int nominator){
        this.nominator=nominator;
    }
    
    public int getNominator(){
        return nominator;
    }
    
    public void setDenominator(int denominator){
        this.denominator=denominator;
    }
    
    public int getdenominator(){
        return denominator;
    }
    
    public void Display(){
        System.out.println("Fraction is : "+nominator+"/"+denominator);
    }
}
