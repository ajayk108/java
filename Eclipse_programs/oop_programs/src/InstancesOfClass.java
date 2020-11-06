
class Student1
{
		int id;//instance variable
		String name;//instance variable
}
public class InstancesOfClass 
{
	public static void main(String[] args)
	{
		
		Student1 obj1 = new Student1();
		obj1.id = 101;
		obj1.name = "Ajay";
		
		Student1 obj2 = new Student1();
		obj2.id = 102;
		obj2.name = "Vijay";
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		System.out.println(obj2.id);
		System.out.println(obj2.name);
	}

}
