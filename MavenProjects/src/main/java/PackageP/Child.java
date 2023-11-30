package PackageP;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child p=new Child();
	//	p.methodA();//(Showing error because it is a private method)
		p.methodB();
		p.methodC();
		p.methodD();
	}

}
