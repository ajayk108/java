/*
 * this keyword passing as an arguments in method call......
 * 
 */
public class thisKeyword2 {
	
	void function1(thisKeyword2 obj)
	{
		System.out.println("Function 1 is invoked......");
	}
	void function2()
	{
		function1(this);
	}

	public static void main(String[] args) {
		
		thisKeyword2 obj1 = new thisKeyword2();
		obj1.function2();

	}

}
