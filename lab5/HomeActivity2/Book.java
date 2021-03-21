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
public class Book {
    private String author;
    private String[] chapterNames=new String[100];
    
    public Book(){
        
    }
    
    public Book(String author, String[] chapterNames){
        this.author=author;
        for(int i=0;i<100;i++){
            this.chapterNames[i]=chapterNames[i];
        } 
    }
    
    public void setAuthorName(String author){
        this.author=author;
    }
    
    public void setChapterNames(String[] chapterNames){
        for(int i=0;i<100;i++){
            this.chapterNames[i]=chapterNames[i];
        }
    }
    
    public boolean compareBooks(Book b){
        return author.equals(b.author);
    }
    
    public String compareChapterNames(Book b){
        int a1=0,a2=0;
        for(int i=0;i<100;i++){
            if(chapterNames[i]!=null){
                a1++;
            }
        }
        
        for(int i=0;i<100;i++){
            if(b.chapterNames[i]!=null){
                a2++;
            }
        }
        
        if(a1>a2){
            return author;
        }else{
            return b.author;
        }
    }
}
