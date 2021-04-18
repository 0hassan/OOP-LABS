/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_lab8.Q_1;

import java.util.Scanner;

/**
 *
 * @author tahir
 */
public class Lab8Runner1 {
    public static void main(String[] args) {
         int i=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Want to Publish ?  Reply With Y/N ?");
        String choise=scan.next();
        Book[] book=new Book[50];
        tape[] tape=new tape[50];
        while(choise.equals("Y") || choise.equals("y")){
            System.out.print("\nWhat do you want to Publish?\nA Book ?\nA Tape ?");
            String chose=scan.next();
            switch(chose){
                case ("book"):
                case ("Book"):
                case ("BOOK"):{
                    book[i]=new Book();
                    System.out.print("Title Of The Book ?    :");
                    book[i].setTitle(scan.next());
                    System.out.print("Price Of The Book ?    :");
                    book[i].setPrice(scan.next());
                    System.out.print("Total Pages Of The Book ?    :");
                    book[i].setTotal_Pages(scan.nextInt());
                    i++;
                    break;
                }
                case ("tape"):
                case ("Tape"):
                case ("TAPE"):{
                    tape[i]=new tape();
                    System.out.print("Title Of The Tape ?    :");
                    tape[i].setTitle(scan.next());
                    System.out.print("Price Of The Tape ?    :");
                    tape[i].setPrice(scan.next());
                    System.out.print("Total Time Of The Tape ?    :");
                    tape[i].setTime(scan.nextDouble());
                    i++;
                    break;
                }
                default:
                    System.out.println("\n--------Invalid Choise-------");
                    break;
            }
            
        System.out.print("\nWant to Publish More ?  Reply With Y/N ?");
        choise=scan.next();
        }
        int j=0;
        System.out.println("\n----------<Published Books Are>----------");
        while(j<i){
            if(book[j]!=null){
                System.out.println("------<Book["+(j+1)+"]>------");
                book[j].Display();
            }
            j++;
        }
        j=0;
        System.out.println("----------<Published Tapes Are>----------");
        while(j<i){
            if(tape[j]!=null){
                System.out.println("------<Tape["+(j+1)+"]>------");
                tape[j].Display();
            }
            j++;
        }
    }   
}
