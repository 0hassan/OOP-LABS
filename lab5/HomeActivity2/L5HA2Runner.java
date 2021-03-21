/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author tahir
 */
import java.util.Scanner;
public class L5HA2Runner {
    public static void main(String[]arg){
        
        String[] chapNames=new String[100];
        
        int i=0;
        
        String cheack="a";
        
        Book book1=new Book();
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Author Name of the book 1:");
        String author1=scan.next();
        
        System.out.println("enter chapters of book 1 and Enter 0 to Terminate:");
        while(!"0".equals(cheack)){
            cheack=scan.next();
            chapNames[i]=cheack;
            i++;
        }
        
        book1.setAuthorName(author1);
        book1.setChapterNames(chapNames);
        
        System.out.println("Enter Author Name of the book 2:");
        String author2=scan.next();
        
        System.out.println("enter chapters of book 2 and Enter 0 to Terminate:");
        cheack="a";
        while(!"0".equals(cheack)){
            cheack=scan.next();
            chapNames[i]=cheack;
            i++;
        }
        Book book2=new Book(author2, chapNames);
        
        if(book1.compareBooks(book2)){
            System.out.println("Author of Both Books is Same:");
        }else{
            System.out.println("Diffrent authors");
        }
        
        String autherWithGreaterChapters=book1.compareChapterNames(book2);
        System.out.println(autherWithGreaterChapters+"'s Book have greater Chapters.");
    }
}
