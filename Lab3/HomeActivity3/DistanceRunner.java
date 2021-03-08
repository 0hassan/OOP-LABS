/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;

/**
 *
 * @author tahir
 */
public class DistanceRunner {
    public static void main(String[]arg){
        Distance runner1=new Distance();
        Distance runner2=new Distance(14, 28);
        runner1.name="runner1";
        runner2.name="runner2";
        runner1.displayinfo();
        runner2.displayinfo();
    }
}
