class A
{
	final void fun1()
	{
		System.out.println("this is fun1 inside the class A");
	}
}
class B extends A
{
	// It is going to give and compile time error...
	public void fun1()
	{
		System.out.println("This is illegal");
	}
}
public class finalMethod {
	
	public static void main(String[] args) {
		
		//it will give an error....
		B obj = new B();
		obj.fun1();		
		
	}

}
