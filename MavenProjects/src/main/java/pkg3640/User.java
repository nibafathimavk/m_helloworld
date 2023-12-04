package pkg3640;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		boolean flag=false;
		b.setPin();
		//System.out.println(b.getPinnum(0));
		
		int pin[]= {1001,1234,1212};
		int val=b.getPinnum(0);
		for(int i=0;i<pin.length;i++)
		{
			if(pin[i]==val)
			{
				flag=true;
				break;
			}
			}
				if(flag==true)
				{
					System.out.println("Pin Accepted");
					
				}
				else{
			System.out.println("Invalid Pin");
			}	
	}
		
		
		
//		if(b.getPinnum(0)==1001 ||b.getPinnum(0)==1234||b.getPinnum(0)==1212 )
//			System.out.println("Pin Accepted");
//		else
//			System.out.println("Invalid pin");
		
	}


