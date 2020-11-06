import java.util.Scanner;

public class swapVar {
	
	int a,b;
	void getData()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("After swapping...");
        System.out.println(a+" "+b);
	}
	void swap()
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping...");
        System.out.println(a+" "+b);
    }
	public static void main(String[] args) {
		
		swapVar obj1 = new swapVar();
		
		obj1.getData();
		obj1.swap();
		
		
	}

}
