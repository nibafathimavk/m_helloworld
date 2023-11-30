package pkg3640;

public class OffSeason extends OnSeason {
	
	double rate;
	
	public double discount(double rate)
	{
		double discountval=(15*rate)/100;
		//System.out.println(this.rate);
		return discountval;
	}
}