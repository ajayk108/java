/*
 * Classes, methods or data members which are declared as public
 *  are accessible from every where in the program
 *  There is no restriction on the scope of a public data members.
 * 
 */
package oop_programs.accessPublic_1;

import oop_programs.accessPublic_2.myclass2;

public class myclass1 {

	public static void main(String[] args) {
		
		myclass2 m = new myclass2();
		
		m.x=5;
		m.show();
	}

}
