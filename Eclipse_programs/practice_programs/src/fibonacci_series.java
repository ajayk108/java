/*
 * print the first 7 number of fibonacci series
 * 0 + 1 + 1 + 2 + 3 + 5 + 8 + .....
 */
public class fibonacci_series {

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=0; i<7; i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
