package Collection;
import java.util.ArrayList;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar=new ArrayList();
		ar.add("Red");
		ar.add("Yellow");
		ar.add("Blue");
		ar.add("Green");
	//ar.add(2);
     System.out.println(ar);
     
     
     //retrieving element from a specific index
    System.out.println();
   String getter=  ar.get(2);
   System.out.println(getter);
   
   
   
   //search an element from array list
   System.out.println();
   System.out.println(ar.contains("black"));
   
   //removing the third element from the list
   System.out.println();
   System.out.println(ar.remove(3));
   System.out.println(ar);
   }

}
