/*
 *  swapping variables without using 3rd variable;
 */
public class swappingwithout3rdvariable {
	
	public static void main(String[] args)
	{
		int x = 100;
		int y = 500;
		System.out.println("Before swapping the value of \nx = "+x+"\ny = "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping the value of \nx = "+x+"\ny = "+y);

	}

}
