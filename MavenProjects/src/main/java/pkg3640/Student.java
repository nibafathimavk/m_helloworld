package pkg3640;

import java.util.Scanner;

public class Student {
	String name;
	int rolno;
	
	void details() {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the name");
	name=scn.next();
	System.out.println("Enter the roll number");
	rolno=scn.nextInt();	
//	System.out.println(name);
//	System.out.println(rolno);
	}
}
