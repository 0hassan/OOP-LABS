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
public class L4HA1Runner {
    public static void main(String[]arg){
        Marks std1=new Marks();
        std1.setEngMarks(55);
        std1.setMathMarks(90);
        std1.setUrduMarks(78);
        int eng=std1.getEngMarks();
        int urdu=std1.getUrduMarks();
        int math=std1.getMatharks();
        System.out.println(eng+","+urdu+","+math);
        std1.displayMarks();
    }
}
