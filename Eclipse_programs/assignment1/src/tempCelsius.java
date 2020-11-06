import java.util.Scanner;

public class tempCelsius {
	 double res;
	 int cel;
	void getData()
	{
		 Scanner myObj = new Scanner(System.in);
	     System.out.println("Enter the value to get the celsius of fahrenheit");
	     cel = myObj.nextInt();
	    
	}
	void cel()
	{
		 res = (cel * 9/5) + 32;
        System.out.println("30 degree Celsius to Fahrenheit ="+res);

	}
	public static void main(String[] args)
	{
		tempCelsius obj1  = new tempCelsius();
		
		obj1.getData();
		obj1.cel();
		       
	}
		
	

}
