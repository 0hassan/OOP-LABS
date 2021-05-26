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
public class Triangle implements shape{
    private int base;
    private int height;
    
    Triangle(){
        this.base=5;
        this.height=6;
    }
    Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }
    
    @Override
    public double area(){
        return 0.5*this.base*this.height;
    }
    
}
