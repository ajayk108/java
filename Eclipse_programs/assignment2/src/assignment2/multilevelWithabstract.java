package assignment2;

abstract class Base
{
	abstract void f1();
	abstract void f2();
}
abstract class derived1 extends Base
{
	 void f1()
	{
		 System.out.println("this is f1() in derived1");
	}
}
class derived2 extends Base
{
	void f2()
	{
		 System.out.println("this is f2() in derived2");

	}
	void f1()
	{
		 System.out.println("this is f1() in derived2");

	}
	void f3()
	{
		 System.out.println("this is f3() in derived2");

	}
}
public class multilevelWithabstract {

	public static void main(String[] args) {
		
		derived2 obj =new derived2();
		obj.f1();
		obj.f2();
		obj.f2();

	}

}
