//.................
//
//custom Exceptions....
//..............
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class Exception5 {
	
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age less than 18.. you cannot vote..");
		}
		else
		{
			System.out.println("Welcome to vote....");
		}
	}

	public static void main(String[] args) {
		
		try
		{
			validate(20);
		}
		catch(Exception e)
		{
			System.out.println("exception occured"+e.getMessage());
		}

	}

}
