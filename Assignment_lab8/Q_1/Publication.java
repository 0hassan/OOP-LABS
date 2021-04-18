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
public class Publication {
    private String title;
    private String price;
    
    public Publication(){
        
    }
    public Publication(String title, String price){
        this.price=price;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public void Display(){
        System.out.println("Title Is:   "+this.title+"\nPrice Is:   "+this.price);
    }
    
}
