
public class methodsOfClass {
	
	public int max(int x, int y)
	{
		if(x>y)
			return x;
		else 
			return y;
	}

	public static void main(String[] args) {
		
		methodsOfClass obj = new methodsOfClass();
		
		int num = obj.max(20, 35);
		
		System.out.println("Larger number is: "+num);
		
	}

}
