/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

import java.util.Scanner;

/**
 *
 * @author tahir
 */
public class L4HA2RUNNER {
    public static void main(String[]arg){
        Account user1=new Account(5000);
        Account user2=new Account();
        int balance=user1.getbalance();
        user2.setbalance(balance);
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Deposit Cash: \n2. Withdraw Cash:");
        System.out.println("What you want to do Chose: 1 OR 2.");
        int op=scan.nextInt();
        if(op==1){
            System.out.println("Enter the ammount?");
            int amount=scan.nextInt();
            user1.deposit(amount);
        }else if(op==2){
            System.out.println("Enter the ammount?");
            int amount=scan.nextInt();
            user1.withdraw(amount);
        }
        
        System.out.println("1. Deposit Cash: \n2. Withdraw Cash:");
        System.out.println("What you want to do Chose: 1 OR 2.");
        op=scan.nextInt();
        if(op==1){
            System.out.println("Enter the ammount?");
            int amount=scan.nextInt();
            user2.deposit(amount);
        }else if(op==2){
            System.out.println("Enter the ammount?");
            int amount=scan.nextInt();
            user2.withdraw(amount);
        }
    }
}
