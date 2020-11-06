
public class staticVariableExample {
	
	int side;
	static int objectCount = 0;
	staticVariableExample()
	{
		objectCount++;
	}
	staticVariableExample(int x)
	{
		side = x;
		objectCount++;
	}
	
	public static void main(String[] args)
	{
		staticVariableExample s1 = new staticVariableExample();
		staticVariableExample s2 = new staticVariableExample(5);
		System.out.println("The objectcount for all objects: "+objectCount);
		System.out.println("vaiable side has a value: "+s2.side);
		
		//System.out.println("static variable: "+objectCount);//without creating object

	
	}

}
