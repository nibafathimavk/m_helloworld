package pkg3640;

public class Divisible10 extends Addition {
	int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Divisible10 d=new Divisible10();
		
		d.divisible();
		
	}
	void divisible()
	{
		super.add();
		sum=super.tot;
	if(sum%10==0)
		System.out.println("Divisible by 10");
	else
		System.out.println("Not Divisible by 10");
	
	}
}
