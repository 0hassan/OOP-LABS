/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_lab8.Q_2;

/**
 *
 * @author tahir
 */
public class Laptop extends Computer{
    public int length;
    public int width;
    public int height;
    public int weight;
    
    public Laptop(){
    //  super();  
        this.height=2;
        this.length=15;
        this.weight=1500;
        this.width=13;
        this.memorySize=1000;
        this.speed=1.0;
        this.storageSize=128000;
        this.wordSize=4;   
    }
    public Laptop(int length, int width, int height, int weight, int wordSize, long memorySize, long storageSize, double speed){
        super(wordSize, memorySize, storageSize, speed);
        this.height=height;
        this.length=length;
        this.weight=weight;
        this.width=width;
    /*
        this.memorySize=memorySize;
        this.speed=speed;
        this.storageSize=storageSize;
        this.wordSize=wordSize;
    */
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("Height of the PC is:    "+this.height+"\nLenght of the PC is:   "+this.length+"\n"
                + "Weight of the PC is: "+this.weight+"\nWidth of the PC is:    "+this.width);
    }
}
