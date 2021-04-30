package Question_3;

public class GraduateStudent extends Student{
    public String stdName;
    public String stdId;
    public String stdCGPA;
    
   GraduateStudent(){
       
   }
   GraduateStudent(String stdName, String stdId, String stdCGPA){
       this.stdCGPA=stdCGPA;
       this.stdId = stdId;
       this.stdName=stdName;
   }
   @Override
   public void exam(){
       System.out.println("you need to present your final presentation.");
        System.out.println("<------------------------------------------->");
   }
}