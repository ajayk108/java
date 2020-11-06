package oop_programs.accessModifiers;
/*
 * The methods or data members declared as private are accessible only within the class
 * in which they are declared.
 * Any other class of same package will not be able to access these members.
 * Classes or interface can not be declared as private.
 */

class A
{
	private int x; 
	private void show()
	{
		System.out.println("the x value is: "+x);
	}
}
public class accessSpecifier {
	
	private int x; 
	private void show()
	{
		System.out.println("the x value is: "+x);
	}

	public static void main(String[] args) {
		
		accessSpecifier obj1 = new accessSpecifier();
		
		//the object of data member and method are accessible
		//because these are inside the same class
		obj1.x=5; 
		obj1.show();
		
		// this will give an error because the object method and data member
		// are outside the class..
		// A a1 = new A();
		// a1.x; 
		// a1.show();
		
	}

}
