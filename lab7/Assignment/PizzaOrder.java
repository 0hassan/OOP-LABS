/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author tahir
 */
public class PizzaOrder {
    private Pizza order[]=new Pizza[3];
    public PizzaOrder(Pizza[] p){
        int i=0;
        while(p[i]!=null){
            order[i]=p[i];
            i++;
        }
    }
    
    public double calTotal(){
        double total=0; int i=0;
        while(order[i]!=null){
            total=total+order[i].calcCost();
            i++;
        }
        return total;
    }
}
