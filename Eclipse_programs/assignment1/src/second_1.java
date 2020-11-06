abstract class Base
{
	abstract void f1();
	abstract void f2();
}
class Derived1 extends Base
{
	void f1()
	{
		System.out.println("f1() method from derived1 class");
	}
	void f2()
	{
		System.out.println("f2() method from derived1 class");
	}
}
class multilevel extends Base
{
	void f1()
	{
		System.out.println("f1() method from multilevel class");
	}
	void f2(){
		System.out.println("f2() method from multilevel class");
	}
    void f3()
    {
		System.out.println("f3() method from multilevel class");
	}	
	public static void main(String[] args)
	{
		Derived1 obj1 = new  Derived1();
		obj1.f1();
		obj1.f2();

		multilevel obj2 = new  multilevel();
		obj2.f1();
		obj2.f2();
		obj2.f3();
	}
}