
public class typecasting {

	public static void main(String[] args) {
		
		int x = 100;
		double d = x; // implicit type casting..
		System.out.println("x: "+x);
		System.out.println("d: "+d);
		
		double d2 = 100.50;
		int y = (int)d2; //explicit type casting..
		System.out.println("d2: "+d2);
		System.out.println("y: "+y);
		
	}

}
