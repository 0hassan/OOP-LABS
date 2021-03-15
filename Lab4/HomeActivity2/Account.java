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
public class Account {
    private int balance;
    
    public Account(){
        balance=1000;
    }
    public Account(int amount){
        balance=amount;
    }
    public void withdraw(int amount){
        if(balance==0){
            System.out.println("Your Current Balance is Zero.\nPlease Deposit some ammount.");
        }
        else{   
        balance = balance-amount;
        System.out.println("Withdraw was successful: your Current Balance is: "+balance);
        }
    }
    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("Ammount deposited successfuly: Your Current Balance is: "+balance);
    }
    public int getbalance(){
        return balance;
    }
    public void setbalance(int amount){
        balance=amount;
    }
}
