	/*
 * this keyword can be used to return current class instance.....
 * 
 */
public class thisKeyword3 {
	
	int a;
	int b;
	thisKeyword3()	//default constructor
	{
		a=10; 
		b=20;
	}
	thisKeyword3 get() //method that returns current class instance
	{
		return this;
	}
	void display()
	{
		System.out.println("a=" + a + "b =" + b);
	}
	

	public static void main(String[] args) {
		
		thisKeyword3 obj = new thisKeyword3();
		obj.get().display();
	}

}
