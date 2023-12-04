package pkg3640;

import java.util.Scanner;

public class Contractor extends Employee {
	float hrs,pay,totpay;
	void calculateSalary()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the total working hours");
		hrs=scn.nextFloat();
		System.out.println("Enter the payment for an hour");
		pay=scn.nextFloat();
		totpay=hrs*pay;
		System.out.println("Total payment recieved is "+totpay);
		
		}
}
