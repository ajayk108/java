
public class palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int rev = 0;
		int temp = num;
		while(num>0)
		{
			rev = rev * 10;
			rev = rev + num%10;
			num = num/10;
		}
		if(rev == temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("NOt palindrome");
		}
	}

}
