import java.util.Scanner;

public class revDigit {

	int m;
	int remainder,reverse ;
	void getData()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
	}
	void revDigits()
	{
		while(m != 0)   
		{  
		remainder = m % 10;  
		reverse = reverse * 10 + remainder;  
		m = m/10;  
		} 
		System.out.println("The reverse of the given number is: " + reverse);  

	}

	public static void main(String[] args) {
		
		revDigit obj1 = new revDigit();
		
		obj1.getData();
		obj1.revDigits();

		 
	}

}
