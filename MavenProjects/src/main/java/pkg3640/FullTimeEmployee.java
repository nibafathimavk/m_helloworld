package pkg3640;

import java.util.Scanner;

public class FullTimeEmployee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contractor c=new Contractor();
		FullTimeEmployee ft=new FullTimeEmployee();
		
		c.calculateSalary();
		ft.calculateSalary();
	}
	
	void calculateSalary()
	{
		float pay,totpay;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the payment for an hour");
		pay=scn.nextFloat();
		totpay=8*pay;
		System.out.println("Total payment recieved is "+totpay);
		
	}
}
