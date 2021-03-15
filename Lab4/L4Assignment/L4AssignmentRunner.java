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
public class L4AssignmentRunner {
    public static void main(String[] args)
	{
		HotDogStand dog1 = new HotDogStand(1234, 2);
		HotDogStand dog2 = new HotDogStand(5567, 0);
		HotDogStand dog3 = new HotDogStand(8899, 1);
		
		dog1.soldedDogs(4);
		dog1.soldedDogs(1);
		dog2.soldedDogs(5);
		dog3.soldedDogs(6);
                int id1=dog1.getStandsID();
                int soldedDogs=dog3.getDogsSoldedToday();
                System.out.println("id of dog1 is "+id1+"\n");
                System.out.println("solded dogs at stand 3 is "+soldedDogs);
						
	}

}
