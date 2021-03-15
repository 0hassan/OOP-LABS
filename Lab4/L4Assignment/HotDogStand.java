/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Assignment;

/**
 *
 * @author tahir
 */
public class HotDogStand{
    private int standsID;
    private int hotDogsSold;
    private  int soldDogs = 0;
    public HotDogStand(){
	standsID = 0;
	hotDogsSold = 0;
}
    public HotDogStand(int newID, int newDogSold){
		standsID = newID;
		hotDogsSold = newDogSold;
		soldDogs = soldDogs+newDogSold;
	}
	
	public void soldedDogs(int n){
		hotDogsSold=n;
		soldDogs = soldDogs+hotDogsSold;
	}
	
	public int getDogsSoldedToday(){
		return soldDogs;
	}
	
	public int getStandsID(){
		return standsID;
	}

}
