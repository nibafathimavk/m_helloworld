package ExceptionPkg;
import java.util.Scanner;
public class VotingMain {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Age");
		age=scn.nextInt();
		try {
			if(age<18 && age>=0)
				throw new Voting("Not Eligible for Voting");
			else if(age>=18)
				System.out.println("Eligible for Voting");
			else if(age<0)

				throw new Voting("Invalid Input");
			}
		catch(Voting e)
		{
			System.out.println(e);
		}

	}

}
