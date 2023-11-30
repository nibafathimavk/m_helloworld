package pkg3640;

import java.util.Scanner;

public class Addition {
int a,b,tot;

 public int add()
{
	 Scanner scn=new Scanner(System.in);
	 System.out.println("Enter the value of a");
	 a=scn.nextInt();
	 System.out.println("Enter the value of b");
	 b=scn.nextInt();
	 tot=a+b;
	// System.out.println(tot);
	return tot;
}
	
}
