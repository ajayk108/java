import java.util.Scanner;

abstract class shap
{
	abstract void area();
}
class rectangle extends shap
{
	void area()
	{
		int l, b;
		System.out.println("Enter length and bridth of rectangle to calculate area: ");
		 Scanner scr = new Scanner(System.in);	 
		 l = scr.nextInt();
		 b = scr.nextInt();
		 System.out.println("the area of rectangle is: "+l*b);	 
	}
}
class Triangle extends shap
{
	void area()
	{
		int l, b;
		System.out.println("Enter length and bridth of Triangle to calculate area: ");
		 Scanner scr = new Scanner(System.in);	 
		 l = scr.nextInt();
		 b = scr.nextInt();
		 System.out.println("the area of rectangle is: "+((l*b)/2));	 
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		
		rectangle obj1 = new rectangle();
		Triangle obj2 = new Triangle();
		obj1.area();
		obj2.area();


	}

}
