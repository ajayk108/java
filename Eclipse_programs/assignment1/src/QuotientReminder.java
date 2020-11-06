import java.util.Scanner;

public class QuotientReminder {
	
	int a,b;
	void getData()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        b = s.nextInt();
	}
	void quorem()
	{
		int quotient = a/b;
		int reminder = a%b;
		System.out.println("Quotient = " + quotient);
		System.out.println("Reminder = " + reminder);
	}

	public static void main(String[] args) {
		
		QuotientReminder obj1 = new QuotientReminder();
		
		obj1.getData();
		obj1.quorem();
		
	}

}
