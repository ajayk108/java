
public class leap_Year {

	public static void main(String[] args) {
		
		int 	year = 2028;
		if(year%400 == 0)
		{
			System.out.println("Leap year");
		}
		else if(year%4 == 0 && year%100!=0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("NOt Leap year");
		}
	}

}
