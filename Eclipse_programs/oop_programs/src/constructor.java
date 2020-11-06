import java.util.Scanner;

public class constructor {
	
	int num;
	constructor() //default constructor
	{
		//num = 5;
		System.out.println("Default constructor called....");
	}
	constructor(int x) //parameterized constructor
	{
		System.out.println("Parameterized constructor called...");
		num = x;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter the value: ");
		Scanner scr = new Scanner(System.in);
		int temp = scr.nextInt();
		
		
		constructor obj = new constructor(temp);
		System.out.println("Number is: "+obj.num);
	}

}
