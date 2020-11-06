/*
 * single inheritance.................
 */

//superclass
class Animals
{
	void printmessage()
	{
		System.out.println("Animal method.....");
	}
}
//sub class....
class Dogs extends Animals
{
	
}

public class inheritance1 {

	public static void main(String[] args)
	{
		Dogs d1 = new Dogs();
		d1.printmessage();
	}

}
