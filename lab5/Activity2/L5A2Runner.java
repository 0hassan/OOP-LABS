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
public class L5A2Runner {
public static void main(String[]arg)
{
double a=10; double b=2.3;
Complex C1 = new Complex(a+1, b);
Complex C2 = new Complex(9, 2.3);
Complex C3 = new Complex(2,3);
Complex C = C1.Add(C2,C3);
C1.Show();
C.Show();
} 
}
