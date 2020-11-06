/*
 * write a program to print first 10 even Numbers starting from 2...
 */
public class whileLoop {

	public static void main(String[] args) {
		
		int evenNumber = 2;
		int i=0;
		while(i<10)
		{
			System.out.println(evenNumber);
			evenNumber = evenNumber +2;
			i++;
		}
	}

}
