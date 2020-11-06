/*
 * polymorphism
 * 
 */
class superClass
{
	void show()
	{
		System.out.println("this is super class....");
	}
}
class sub extends superClass
{
	void show()
	{
		System.out.println("this is sub class");
	}
}
public class plymorphism1 extends sub {
	
	void show()
	{
		System.out.println("this is polymorphism1 class");
	}

	public static void main(String[] args) {
		
		superClass obj = new superClass();
		obj.show();
		obj = new sub();
		obj.show();
		obj = new plymorphism1();
		obj.show(); 

		
	}

}
