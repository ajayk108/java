class per
{
	void message()
	{
		System.out.println("this is person class");
	}
}
class stu extends per
{
	void message()
	{
		System.out.println("this is studend class");
	}
	void display()
	{
		message();
		super.message();
	}
}
public class super2 
{

	public static void main(String[] args) 
	{
		
		stu s = new stu();
		s.display();
		
	}

}
