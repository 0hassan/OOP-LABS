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
public class Student {
    private int[] Result_Array=new int[5];
    private String Name;
    
    public Student(){
        for(int i=0;i<=4;i++){
            Result_Array[i]=5;
        }
    }
    
    public Student(String nam, int[] marks){
        for(int i=0;i<=4;i++){
            Result_Array[i]=marks[i];
        }
        Name=nam;
    }
    
    public void putmarksName(int[] marks, String nam){
        for(int i=0;i<=4;i++){
            Result_Array[i]=marks[i];
        }
    }
    
    public int Average(){
        int sum=0;
        for(int i=0;i<=4;i++){
            sum=sum+Result_Array[i];
        }
        return sum/5;
    }
}
