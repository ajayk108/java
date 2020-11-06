
public class finalVariable {
	
	//final variable direct initialization
	final int CONSTANT = 5;
	 
	//blank final variable
	final int CAPACITY;
	
	//another blank final variable
	final int MINIMUM;
	
	//instant initializer block of initializing CAPACITY
	{
		CAPACITY = 10;
	}
	//constructor for initializing MINIMUM, 
	//note that if there are more than one constructor then
	//you must initialize MINIMUM in them also
	finalVariable()
	{
		MINIMUM = 1;
	}
	
	//final static variable PI direct initialize
	static final double PI = 3.14;
	
	//blank final static variable
	final static double SUMCONSTANT;
	
	//STATIC initializer block for initializing SUMCONSTANT;
	static{
		SUMCONSTANT =1;
	}
	
	public static void main(String[] args)
	{
		
		finalVariable obj = new finalVariable();
		
	}

}
