package pkg3640;

import java.util.Scanner;


public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
       
        System.out.print("Enter type of clothes ");
        String season=scn.next();
        System.out.print("Enter the rate");
        double rate= scn.nextDouble();
        
        OnSeason on=new OnSeason();
        OffSeason off=new OffSeason();
        System.out.println("Item rate = "+rate);
        if(season.equals("onseason"))
      System.out.println("Discount recieved on Onseason"+on.discount(rate));
        else if(season.equals("offseason"))
      System.out.println("Discount recieved on Offseason"+off.discount(rate));
	}

}

