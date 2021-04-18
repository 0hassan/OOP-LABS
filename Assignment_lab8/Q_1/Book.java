/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_lab8.Q_1;

/**
 *
 * @author tahir
 */
public class Book extends Publication{
    private int Total_Pages;
    
    public Book(){
        
    }
    public Book(String title, String price, int total_pages){
        this.Total_Pages=total_pages;
        super.setTitle(title);
        super.setPrice(price);
    }

    public int getTotal_Pages() {
        return Total_Pages;
    }

    public void setTotal_Pages(int Total_Pages) {
        this.Total_Pages = Total_Pages;
    }
    @Override
    public void Display(){
        System.out.println("Title Is:   "+super.getTitle()+"\nPrice Is:   "+super.getPrice()+"\nTotal Pages:    "+this.Total_Pages);
    }
    
    
}
