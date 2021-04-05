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
public class L6HA1Runner {
    
    public static void main(String[]arg){
        SavingAccount saver1=new SavingAccount();
        saver1.setSavingsBalance(2000);
        SavingAccount saver2=new SavingAccount(3000);
        double saving1, saving2;
        
        saving1=saver1.getSavingsBalance()+saver1.calculateMonthlyInetrest();
        saver1.setSavingsBalance(saving1);
        
        saving2=saver2.getSavingsBalance()+saver2.calculateMonthlyInetrest();
        saver2.setSavingsBalance(saving2);
        
        System.out.println("balance of saver1 :"+saver1.getSavingsBalance());
        System.out.println("balance of saver2 :"+saver2.getSavingsBalance());
        
        System.out.println("after year insterest rate will be 0.015");
        SavingAccount.anualInterestRate=0.015;
    }
}
