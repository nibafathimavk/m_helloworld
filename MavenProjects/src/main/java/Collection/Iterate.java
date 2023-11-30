package Collection;
import java.util.ArrayList;
public class Iterate {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList();
		ar.add("Red");
		ar.add("Yellow");
		ar.add("Blue");
		ar.add("Green");
		
		
		for (int i=0;i<ar.size();i++)
				{
			
			System.out.println(ar.get(i));
				}
	}

}
