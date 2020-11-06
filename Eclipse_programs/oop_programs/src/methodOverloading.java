
public class methodOverloading 
{
	int add(int x, int y)
	{
		return(x+y);
	}
	int add(int x, int y, int z)
	{
		return(x+y+z);
	}
	double add(double x, double y)
	{
		return(x+y);
	}
	public static void main(String[] args) 
	{
		methodOverloading obj = new methodOverloading();
		int toatl1 = obj.add(3, 4);
		System.out.println("fist Addition is: "+toatl1);
		int total1 = obj.add(5,10,35);
		System.out.println("second Addition is: "+total1);
		double total2 = obj.add(4.4, 5.6);
		System.out.println("third Addition is: "+total2);
		
		
	}

}
