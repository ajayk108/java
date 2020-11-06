import java.util.Scanner;

public class inputfromuser {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = scr.nextInt();
		System.out.println("the value is: "+x);
		Scanner scr2 = new Scanner(System.in);
		String str = scr2.nextLine();
		System.out.println("the string is: "+str);
		
		
	}

}
