package pkg3640;

import java.util.Scanner;

public class StudAddress {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String addr;
     Student s=new Student();
     s.details();
     Scanner scn=new Scanner(System.in);
		System.out.println("Enter the address");
		 addr=scn.next();
		System.out.println(s.name);
		System.out.println(s.rolno);
		System.out.println(addr);
     
     
		
	}
	
	
}
