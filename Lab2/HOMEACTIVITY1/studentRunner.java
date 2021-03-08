/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeactivity;

/**
 *
 * @author cui
 */
public class studentRunner {
    public static void main(String[]arg){
        student s1,s2;
        s1 =new student();
        s1.Studentname="hassan";
        s1.campus="islamabad";
        s1.digree="SE";
        s1.session="spring";
        s1.yearofadmission=2020;
        s1.rollno=1;
        s1.regnogenerator();
        s1.portalidgenerator();
        s2 = new student();
        s2.Studentname="sajjad";
        s2.campus="islamabad";
        s2.digree="SE";
        s2.session="fall";
        s2.yearofadmission=2021;
        s2.rollno=2;
        s2.regnogenerator();
        s2.portalidgenerator();
    }
}
