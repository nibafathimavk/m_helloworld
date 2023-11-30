package ExceptionPkg;

public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try
		{
			int a=10/0;
		}
        catch(ArithmeticException e)
		{
        	System.out.println(e);
		}
		System.out.println("End");
	}

}
