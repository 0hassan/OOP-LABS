/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2a1;
public class ShowResultRunner {
    public static void main(String[] args) {
    ShowResult c1=new ShowResult();
    c1.StudentName="ali";
    c1.Corsename="OOP";
    c1.grade="A";
    ShowResult c2=new ShowResult();
    c2.StudentName="hassan";
    c2.Corsename="ICT";
    c2.grade="A+";
    c1.display();
    c2.display();
        System.out.println(c1.Corsename);
}
    
}
