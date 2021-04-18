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
public class Computer {
    public int wordSize;
    public long memorySize;
    public long storageSize;
    public double speed;   
    
    public Computer(){
        this.memorySize=1000;
        this.speed=1.0;
        this.storageSize=128000;
        this.wordSize=4;  
    }
    public Computer(int wordsize, long memorysize, long storagesize, double speed){
        this.memorySize=memorysize;
        this.wordSize=wordsize;
        this.storageSize=storagesize;
        this.speed=speed;
    }
    
    public void Display(){
        System.out.println("Size of Word in this PC is: "+this.wordSize+"\nMemory Size in this PC is:   "+this.memorySize+"\n"
                + "Storagr Size in this PC is:  "+this.storageSize+"\nSpeed of the PC is:   "+this.speed);
    }
}
