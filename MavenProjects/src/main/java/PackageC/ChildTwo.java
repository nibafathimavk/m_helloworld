package PackageC;

import PackageP.Parent;

public class ChildTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		//	p.methodA();// Not visible as the method is private
		//	p.methodB();// Not visible as the method is protected
			p.methodC();
		//	p.methodD();// Not visible as the method is default
	}

}
