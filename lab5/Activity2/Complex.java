/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author tahir
 */
public class Complex {
    private double real;
    private double imag;
    public Complex(){
        real = 0.0; imag = 0.0; }
    public Complex (double r, double im){
        real = r; imag = im; }
    public Complex Add (Complex c2, Complex c3){
       Complex sajjad= new Complex( real + c2.real+c3.real, imag+ c2.imag+c3.imag);
        return sajjad;
    }
    public void Show(){
        System.out.println( real + imag);
    }

}
