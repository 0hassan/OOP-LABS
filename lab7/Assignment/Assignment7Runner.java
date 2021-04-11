/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.util.Scanner;
/**
 *
 * @author tahir
 */
public class Assignment7Runner {
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Want to Order A Deal: Reply With Y/N ?");
        String choise=scan.next();
        if(choise.equals("Y") || choise.equals("y")){
            Pizza pizza[]=new Pizza[3];
            int i=0;
            while((choise.equals("Y") || choise.equals("y")) && (i<3)){
                pizza[i]=new Pizza();
                System.out.print("Size: small?    medium?    or large?    :");
                String size=scan.next();
                pizza[i].setSize(scan.next());
                System.out.print("Number of Cheez Toppings?    :");
                pizza[i].setNoChezTop(scan.nextInt());
                System.out.print("Number of Pepperoni Toppings?    :");
                pizza[i].setNoPeproniTop(scan.nextInt());
                System.out.print("Number of Ham Toppings?    :");
                pizza[i].setNoHamTop(scan.nextInt());
                i++;
                System.out.println("Successfully Ordered........\n");
                System.out.print("Want to Order Another Piza: Reply with Y/N ?");
                choise=scan.next();
            }
            i=0;
            System.out.println("--------------Your Order Is-------------");
            while(pizza[i]!=null){
                System.out.println("------"+(i+1)+"------");
                System.out.println(pizza[i].getDescription());
                i++;
            }
            PizzaOrder order1=new PizzaOrder(pizza);
            System.out.println("------Your Ordered Is Confirmed-----\nLoading........\n");
            System.out.println("Your Total Bill Is :    $"+order1.calTotal());
        }
    }
}
