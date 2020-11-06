/*
 * hierarchical  inheritance.................
 */

//superclass
class Animals2
{
	void printmessage()
	{
		System.out.println("Animal method.....");
	}
}
//sub class....
class Dogs2 extends Animals
{
	void dogeat()
	{
		System.out.println("Dogs eat....");
	}
}
//subclass
class Cats2 extends Animals
{
	void cateat()
	{
		System.out.println("Cats eat....");
	}
}

public class inheritance2{

	public static void main(String[] args)
	{
		Dogs2 d1 = new Dogs2();
		d1.printmessage();
		d1.dogeat();
		
		Cats2 c1 = new Cats2();
		c1.printmessage();
		c1.cateat();
		
	}

}
