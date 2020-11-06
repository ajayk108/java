/*
 * multilevel  inheritance.................
 */

//superclass
class Animals3
{
	void printmessage()
	{
		System.out.println("Animal method.....");
	}
}
//sub class....
class Dogs3 extends Animals3
{
	void dogEat()
	{
		System.out.println("Dogs eat....");
	}
}
//subclass
class puppyDogs3 extends Dogs3
{
	void puppyEat()
	{
		System.out.println("Puppy dog eats...");
	}
}

public class inheritance3{

	public static void main(String[] args)
	{
		puppyDogs3 p1 = new puppyDogs3();
		p1.puppyEat();
		p1.dogEat();
		p1.printmessage();
	}

}
