package pkg3640;

import java.util.Scanner;

public class Bank {

	private int pinnum;
	
	public void setPin()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the pin number");
		pinnum=scn.nextInt();
		
	}
	public int getPinnum(int pin)
	{
		return pinnum;
	}
	
}
