package Question_2;

import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer{
    public static void main(String[] args) {
        String string="i love 43 and nikal pehli 67 23,12,34,saad";
        CustomStringTokenizer st=new CustomStringTokenizer(string," ,");
         System.out.println("Number of Tokens :  "+st.countTokens());
        
    }

    public CustomStringTokenizer(String string, String string1) {
        super(string, string1);
    }
    @Override
    public int countTokens() throws NumberFormatException{
        int count=0;
        while(this.hasMoreElements()){
            String temp=null;
            try{
                temp=this.nextToken();
                int i=Integer.valueOf(temp);
                System.out.println(i);
            }
            catch (NumberFormatException e){
                System.out.println(temp);
                count++;
            }
        }
        return count;
    }
}