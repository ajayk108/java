import java.io.IOException;

//
//	throws....... exception..........
//
public class Exception4 {
	
	void m()throws IOException
	{
		throw new IOException("Device error");	//checked exception
	}
	void n() throws IOException
	{
		m();
	}
	void p() throws IOException
	{
		try
		{
			n();
		}
		catch(Exception ex)
		{
			System.out.println("exception handled.....");
		}
	}
	public static void main(String[] args) {
		
		Exception4 obj = new Exception4();
		try
		{
			obj.p();
		}
		catch(Exception ex)
		{
		}
		System.out.println("normal flow......");

		
	}

}
