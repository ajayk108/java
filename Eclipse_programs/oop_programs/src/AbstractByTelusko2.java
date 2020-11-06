
public class AbstractByTelusko2 {

	
	public static void show(Phone obj)
	{
		obj.showConfig();
	}
	public static void main(String[] args) {
		
		Iphone obj = new Iphone();
		Samsungj6 obj2 = new Samsungj6();
		show(obj);
		show(obj2);
	}

}
abstract class Phone
{
	public abstract void showConfig();
}
class Iphone extends Phone
{
	public void showConfig()
	{
		System.out.println("2 Gb , IOS 9.3");
	}
}
class Samsungj6 extends Phone
{
	public void showConfig()
	{
		System.out.println("andriod 10");
	}
}