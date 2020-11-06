/*
 * Default access modifier
 *  
 * If you don’t use any modifier, it is treated as default by default.
 * The data members, class or methods which are not declared using any access modifiers 
 * i.e. having default access modifier are accessible only within the same package.
 * 
 * default access modifier is less restrictive compare to the private access modifier.
 */
package oop_programs.accessModifiers;

class B
{
	int x;
	void show()
	{
		System.out.println("the value is x: "+x);
	}
}

public class p1 {

	public static void main(String[] args) {
		
		//the class of a object is outside the p1 class but in same package.
		B b1 = new B();
		b1.x=5;
		b1.show();
	}

}
