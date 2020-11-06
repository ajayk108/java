package oop_programs.accessProtected_1;

import oop_programs.accessProtected_2.myclass2;

public class myclass1 extends myclass2 {

	public static void main(String[] args) {
		
		myclass1 m1 =new  myclass1();
		
		
		//the data member and methods is accessible even it is from different package 
		//because we have declared that data member and method as protected in that class
		// and we have extended that myclass2 in this current package class 
		m1.x=5; 
		m1.show();
	}

}
