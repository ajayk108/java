
public class Exception1 {

	public static void main(String[] args) {
		
		int a, b;
		a=30;
		b=0;
		try
		{
			int z= a/b;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("exception is: "+ex);
		}
		finally
		{
			System.out.println("finally block....");
		}
		
		System.out.println("this is the last statement...");
		
	}

}
