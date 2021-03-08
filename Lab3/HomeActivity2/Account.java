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
    int balance;
    
    public Account(){
    }
    public Account(int amm){
        balance=amm;
    }
    public void withdraw(int amm){
        if(balance==0){
            System.out.println("Your Current Balance is Zero.\nPlease Deposit some ammount.");
        }
        else{   
        balance = balance-amm;
        System.out.println("Withdraw was successful: your Current Balance is: "+balance);
        }
    }
    public void deposit(int amm){
        balance = balance+amm;
        System.out.println("Ammount deposited successfuly: Your Current Balance is: "+balance);
    }
    
}
