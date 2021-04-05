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
public class L6HA2Runner {
    public static void main(String[]arg){
        int check=1, index=0;
        counter[] c=new counter[50]; 
        Scanner scan=new Scanner(System.in);
    while(check!=0 && index<50){
        System.out.print("enter 1 for new object and \nenter 2 to destroy old object and \nenter 3 for displaying all objects and \nenter 0 to exit :");
        check=scan.nextInt();
        switch(check){
            case 1:{
                for(int i=0; i<50; i++){
                    if(c[i]==null){
                        c[i]=new counter();
                        break;
                    }
                }
                index++;
                break;
            }
            case 2:{
                System.out.print("enter the index of object you want to delete :");
                int del=scan.nextInt();
                if(c[del]!=null){
                    c[del]=null;
                    counter.destructed++;
                    counter.constructed--;
                    System.out.println("object is successfuly delleted");
                }
                else System.out.println("object does not exist :");
                break;
            }
            case 3:{
                for(int i=0; i<=index; i++){
                    if(c[i]!=null) System.out.println("c"+i+"  "+c[i].data);
                }
            }
            default:{
                break;
            }
        }
        
    }
    if(index==50) System.out.println("Array is full :");
        System.out.println("destructed :"+counter.destructed);
        System.out.println("constructed :"+counter.constructed);
    }
}
