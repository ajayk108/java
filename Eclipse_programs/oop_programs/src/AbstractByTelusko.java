
public class AbstractByTelusko {

	public static void main(String[] args) {

		Mahesh obj = new Suresh();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	}

}
abstract class Mahesh		//Abstract class
{
	public void call()
	{
		System.out.println("callin....");
	}
	
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class Ramesh extends Mahesh		//Abstract class
{
	public void move()
	{
		System.out.println("moving....");
	}
}
class Suresh extends Ramesh			// Concrete class
{
	public void dance()
	{
		System.out.println("dancing....");
	}
	public void cook()
	{
		System.out.println("cooking...");
	}
}


