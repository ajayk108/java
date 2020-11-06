import java.util.*;

class InvalidUserException extends Exception
{
	InvalidUserException(String msg)
	{
		super(msg);
	}
}
class InvalidPasswdException extends Exception
{
	InvalidPasswdException(String msg)
	{
		super(msg);
	}
}
class security
{

	String uname;
	String passwd;
	
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter UserName: ");
		uname = sc.nextLine();
		System.out.println("Enter PassWord:");
		passwd = sc.nextLine();
	}
	void Check()throws InvalidUserException, InvalidPasswdException
	{
		String s1 = "user";
		String s2 = "admin";
		if((uname.equals(s1)) && (passwd.equals(s2)))
		{
			System.out.println("welcome You are correct.........!!!");	
		}	
		else if(!(uname.equals(s1)) && !(passwd.equals(s2)))
		{
			System.out.println("Invalid user and password....!!!");
		}
		else if(!(uname.equals(s1)))
		{
			throw new InvalidUserException("Invalid User Name");
		}
		else
		{
			throw new InvalidPasswdException("Invalid Password");
		}
	}
}
public class customException {
	
	public static void main(String[] args)
	{
		security obj = new security();
			
		try
		{
			obj.getData();
			obj.Check();
		}
		catch(InvalidUserException U)
		{
			System.out.println(U);
		}
		catch(InvalidPasswdException P)
		{
			System.out.println(P);
		}		
	}
}
