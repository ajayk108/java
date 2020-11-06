import java.util.Scanner;

public class arithmaticOp {
	
	static void add(int x, int y)
    {
		System.out.println("Addition = "+(x + y));
    }
    static void sub(int x, int y)
    {
    	System.out.println("Subtraction = "+(x - y));
    }
    static void mul(int x, int y)
    {
    	System.out.println("Multiplication = "+(x * y));
    }
    static void div(int x, int y)
    {
    	System.out.println("Division = "+(x / y));
    }

	public static void main(String[] args) {
		
          int a, b;
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the number:");
          a = s.nextInt();
          b = s.nextInt();
            
            add(a, b);
            sub(a, b);
            mul(a, b);
            div(a, b);

	}

}
