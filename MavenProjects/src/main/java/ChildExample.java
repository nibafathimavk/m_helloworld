
public class ChildExample extends ParentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildExample c=new ChildExample();
		c.display();
		
	}
 public void display()
{
	 super.display();
	System.out.println("This is the child class");
}
}
