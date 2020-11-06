/*
 * find factorial of a Number...
 * 5! = 5 x 4 x 3 x 2 x 1 = 120
 * 4! = 4 x 3 x 2 x 1 = 24
 * 
 */
public class factorial {

	public static void main(String[] args) 
	{
		int num = 5;
		int factorial = 1;
		
		for(int i=num; i>0; i--)
		{
			factorial = factorial * i;
		}
		System.out.println("factorial no:"+factorial);
	}

}
