/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentL6;

/**
 *
 * @author tahir
 */
public class L6AssignmentRunner {
    public static void main(String[]arg){
        System.out.println("what you want to do :");
        System.out.println("\n1. Sum\n2. Product\n3. Subtraction\n4. Division\n5. sine of x\n6. Cosine of x\n7. Tangent of x\n0.  for exit");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int check=1;
    while(check!=0){
        System.out.print("Choseee  ?");
        check=scan.nextInt();
        switch(check){
            case 1:{
                System.out.print("Enter 1st number :");
                int a=scan.nextInt();
                System.out.print("Enter 2nd number :");
                int b=scan.nextInt();
                System.out.print("Enter 3rd number :");
                int c=scan.nextInt();
                System.out.println(a+"+"+b+"+"+c+"="+calculator.sum(a, b, c));
                break;
            }
            case 2:{
                System.out.print("Enter 1st number :");
                int a=scan.nextInt();
                System.out.print("Enter 2nd number :");
                int b=scan.nextInt();
                System.out.print("Enter 3rd number :");
                int c=scan.nextInt();
                System.out.println(a+"*"+b+"*"+c+"="+calculator.product(a, b, c));
                break;
            }
            case 3:{
                System.out.print("Enter 1st number :");
                int a=scan.nextInt();
                System.out.print("Enter 2nd number :");
                int b=scan.nextInt();
                System.out.println(a+"-"+b+"="+calculator.subtract(a, b));
                break;
            }
            case 4:{
                System.out.print("Enter 1st number :");
                int a=scan.nextInt();
                System.out.print("Enter 2nd number :");
                int b=scan.nextInt();
                System.out.println(a+"/"+b+"="+calculator.divide(a, b));
                break;
            } 
            case 5:{
                System.out.print("Enter number :");
                int a=scan.nextInt();
                System.out.println("Sine of "+a+"="+calculator.sin(a));
                break;
            }
            case 6:{
                System.out.print("Enter number :");
                int a=scan.nextInt();
                System.out.println("Cosine of "+a+"="+calculator.cos(a));
                break;
            }
            case 7:{
                System.out.print("Enter number :");
                int a=scan.nextInt();
                System.out.println("Tangent of "+a+"="+calculator.tan(a));
                break;
            }
            default:{
                break;
            }
        }
        
    }
    
    }
}
