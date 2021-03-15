/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author tahir
 */
public class Marks {
    private int urdu,eng,math;
    
    public Marks(){
        
    }
    public Marks(int u, int e, int m){
        urdu=u;
        eng=e;
        math=m;
        
    } 
    public void setUrduMarks(int u){
        urdu=u;
    }
    public void setEngMarks(int e){
        eng=e;
    }
    public void setMathMarks(int m){
        math=m;
    }
    public int getUrduMarks(){
        return urdu;
    }
    public int getEngMarks(){
        return eng;
    }
    public int getMatharks(){
        return math;
    }
    public void displayMarks(){
        System.out.println("Urdu :  "+urdu+"\nEnglish : "+eng+"\nMath :    "+math);
    }
}
