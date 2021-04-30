package Question_3;

public class PhDStudent extends Student{
    public String stdName;
    public String stdId;
    public String stdCGPA;
    
   PhDStudent(){
       
   }
   PhDStudent(String stdName, String stdId, String stdCGPA){
       this.stdCGPA=stdCGPA;
       this.stdId = stdId;
       this.stdName=stdName;
   }
    @Override
    public void exam(){
       System.out.println("Your exam will start on 1PM\nYou need to complete "
               + "paper in 2 hours.");
        System.out.println("<------------------------------------------->");
   }
}