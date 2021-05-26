/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssignment;

/**
 *
 * @author tahir
 */
public class Rectangle implements shape{
    private int length;
    private int width;
    
    public Rectangle(){
        this.length=5;
        this.width=2;
        
    }
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area(){
        return this.length*this.width;
    }
    
}
