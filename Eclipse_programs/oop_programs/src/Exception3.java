//
//	throw....... exception..........
//
public class Exception3 {
	
	static void validate(int age)
	{
		if(age < 18)
			throw new ArithmeticException("not valid");
		else 
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		
		//try
		//{
			validate(12);
		//}
		//catch(Exception ex) {}
		//System.out.println("rest of the code...");
	}

}
