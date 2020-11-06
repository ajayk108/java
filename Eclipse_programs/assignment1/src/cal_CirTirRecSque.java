import java.util.Scanner;

public class cal_CirTirRecSque {
	
	void circle()
	{
		 int r;
	        double pi = 3.14, area;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        r = s.nextInt();
	        area = pi * r * r;
	        System.out.println("Area of circle:"+area);
	}
	void triangle()
	{
		int l, b;
		System.out.println("Enter length and bridth of Triangle to calculate area: ");
		 Scanner scr = new Scanner(System.in);	 
		 l = scr.nextInt();
		 b = scr.nextInt();
		 System.out.println("the area of rectangle is: "+((l*b)/2));
	}
	void rectangle()
	{
		int l, b;
		System.out.println("Enter length and bridth of rectangle to calculate area: ");
		 Scanner scr = new Scanner(System.in);	 
		 l = scr.nextInt();
		 b = scr.nextInt();
		 System.out.println("the area of rectangle is: "+l*b);	
		
	}
	void square()
	{
		System.out.println("Enter Side of Square:");
	       Scanner scanner = new Scanner(System.in);
	       double side = scanner.nextDouble();
	       double area = side*side; 
	       System.out.println("Area of Square is: "+area);
	}

	public static void main(String[] args) {
		
		cal_CirTirRecSque obj1 = new cal_CirTirRecSque();
		
		obj1.circle();
		obj1.triangle();
		obj1.rectangle();
		obj1.square();
	}

}
