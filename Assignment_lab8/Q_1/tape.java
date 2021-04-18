/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_lab8.Q_1;

/**
 *
 * @author tahir
 */
public class tape extends Publication{
    private double time;
    
    public tape(){
        
    }
    public tape(String title, String price, double time){
        this.time=time;
        super.setTitle(title);
        super.setPrice(price);
    }
    
    @Override
    public void Display(){
        System.out.println("Title Is:   "+super.getTitle()+"\nPrice Is:   "+super.getPrice()+"\nDuration Is:    "+this.time);
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
