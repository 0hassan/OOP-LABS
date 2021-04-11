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
public class Pizza {
    private String size;
    private int NoChezTop;
    private int NoPeproniTop;
    private int NoHamTop;
    
    public Pizza(){
        
    }
    
    public Pizza(String size, int cheztop, int peptop, int hamtop){
        this.NoChezTop=cheztop;
        this.NoHamTop=hamtop;
        this.NoPeproniTop=peptop;
        this.size=size;
    }

    public double calcCost(){
        double cost;
        switch (this.size) {
            case "small":
            case "s":
            case "S":
                cost=10+(2*this.NoChezTop)+(2*this.NoHamTop)+(2*this.NoPeproniTop);
                return cost;
            case "medium":
            case "m":
            case "M":
                cost=12+(2*this.NoChezTop)+(2*this.NoHamTop)+(2*this.NoPeproniTop);
                return cost;
            case "large":
            case "l":
            case "L":
                cost=14+(2*this.NoChezTop)+(2*this.NoHamTop)+(2*this.NoPeproniTop);
                return cost;
            default:
                System.out.println("Invalid Choise!!!!!");
                return 0;
        }
        
    }
    
    public String getDescription(){
        return "Pizza Size: "+this.size+"\nCheez Topping: "+this.NoChezTop+"\nPepperoni Topping: "+this.NoPeproniTop+"\nHamming Topping: "+this.NoHamTop+"\nCost: "+this.calcCost();
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNoChezTop() {
        return NoChezTop;
    }

    public void setNoChezTop(int NoChezTop) {
        this.NoChezTop = NoChezTop;
    }

    public int getNoPeproniTop() {
        return NoPeproniTop;
    }

    public void setNoPeproniTop(int NoPeproniTop) {
        this.NoPeproniTop = NoPeproniTop;
    }

    public int getNoHamTop() {
        return NoHamTop;
    }

    public void setNoHamTop(int NoHamTop) {
        this.NoHamTop = NoHamTop;
    }
    
    
}
