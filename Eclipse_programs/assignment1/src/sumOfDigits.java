import java.util.Scanner;

public class sumOfDigits {
	
	int m;
	int n, sum = 0;
	void getData()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
	}
	void sumDigit()
	{
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
	}

	public static void main(String[] args) {
		
		sumOfDigits obj1 = new sumOfDigits();
		
		obj1.getData();
		obj1.sumDigit();
		
	}

}
