

public class passbyValue {
	
	static void displaypremetive(int a)
	{
		a= a+a;
		System.out.println("inside the disppremetive fun a: "+a);
	}

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("before fun call a: "+a);
		displaypremetive(a);
		System.out.println("after fun call a: "+a);
	}

}
