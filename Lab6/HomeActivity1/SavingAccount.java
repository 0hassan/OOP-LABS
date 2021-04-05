/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author tahir
 */
public class SavingAccount {
    public static double anualInterestRate=0.01;
    private double savingsBalance;
    
    
    public SavingAccount(){
        
    }
    
    public SavingAccount(double balance){
        this.savingsBalance=balance;
    }

    public static void setAnualInterestRate(double set){
        anualInterestRate=set;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInetrest(){
        return (this.savingsBalance*anualInterestRate)/12;
    }
}
