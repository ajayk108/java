package packageExample;

import mypackage1.myclass1;
import mypackage1.myclass2;
import mypackage1.subpackage.subpackageclass;
//import mypackage1.*;

public class packageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myclass1 obj1 = new myclass1();
		obj1.showData();
		myclass2 obj2 = new myclass2();
		obj2.showData();
		subpackageclass obj3 = new subpackageclass();
		obj3.showData();
				
	//mypackage1.myclass1 obj = new mypackage1.myclass1(); //this is also valid 
		

	}

}
