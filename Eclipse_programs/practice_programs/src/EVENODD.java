
import java.util.Scanner;


public class EVENODD {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = scr.nextInt();
		
		if(x%2 == 0)
		{
			System.out.println("Even number...");
		}
		else
		{
			System.out.println("Odd number....");
		}
	}

}
