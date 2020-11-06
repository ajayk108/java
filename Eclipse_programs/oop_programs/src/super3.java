
class persons
{
	int x;
	persons()
	{
		//System.out.println("this is person constructor");
	}
	persons(int temp)
	{
		x= temp;
		System.out.println("this is person constructor");
		System.out.println("x: "+x);
	}
}
class students extends persons
{
	students()
	{
		//super();
		super(5);
		System.out.println("this is student constructor");
	}
}
public class super3 {

	public static void main(String[] args) {
		
		students s = new students();
	}

}
