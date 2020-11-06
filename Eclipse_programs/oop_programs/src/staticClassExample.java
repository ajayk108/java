
public class staticClassExample {
	
	static String str="Asus";
	
	static class Inner
	{
		void msg()
		{
			
			System.out.println("this is the message for Inner class.....");
			System.out.println("the string: "+str);
		}
	}
	
	public static void main(String[] args) {
		
		staticClassExample.Inner obj1 = new staticClassExample.Inner();
		obj1.msg();
		
		//System.out.println(str);

	}

}
