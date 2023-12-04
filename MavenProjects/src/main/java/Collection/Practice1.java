package Collection;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add("true");
        ar.add("*");
        System.out.println(ar.size());
        System.out.println(ar);
        ArrayList a= new ArrayList();
        a.add("Niba");
        a.add("Munna");
        System.out.println(a.size());
        System.out.println(a);
        ar.addAll(a);
        System.out.println(ar);
        
       String getter=(String) ar.get(4);
       System.out.println(getter);
	  ar.set(2, 10);
	  System.out.println(ar);
	  
	  ar.remove((Integer)10);
	  System.out.println(ar);
	  
	 ar.contains("Niba");
	  //System.out.println(ar);
	 
	 System.out.println();
	 System.out.println(ar);
	 System.out.println(ar.contains(1));
	}

	

}
