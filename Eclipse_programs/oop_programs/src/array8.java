/*
 * Returning array from methods......
 */
public class array8 {
	
	static int[] returnarray()
	{
		int marks[] = {55, 66, 88, 48, 97};
		return marks;
	}
	
	public static void main(String[] args)
	{
		
		//returns an array from method
		int m[] = returnarray();
		for(int k:m)
		{
			System.out.print(k+" ");
		}
	}
	
	
}
