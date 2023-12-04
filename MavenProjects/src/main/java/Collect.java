import java.util.ArrayList;
import java.util.Iterator;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Niba");
		ar.add("true");
		ar.add("1");
		ar.add("2");
		 System.out.println(ar);
		 
		 Iterator it=ar.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
			
	}

}
