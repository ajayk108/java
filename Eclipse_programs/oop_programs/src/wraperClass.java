
public class wraperClass {

	public static void main(String[] args) {
		
		int a = 20;
		Integer i = a; //converting into int Integer;//Autoboxing
		Integer j = new Integer(10);
		System.out.println(a+" "+i+" "+j);
		
		
		Character ch = 'a';
		char c = ch; 	//unboxing Character object to primitive conversion.
		System.out.println("Character ch: "+ch);
		System.out.println("char c: "+c);
	}

}
