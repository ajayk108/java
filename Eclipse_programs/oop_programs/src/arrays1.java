import java.util.Scanner;
/*
 * single Dimensional arrays......
 * 
 */
public class arrays1 {

	public static void main(String[] args) {
		
		int arr[]; //declaring array
		arr =  new int[5]; // allocating memory to array...
		System.out.println("Enter the elements of arrya...");
		Scanner scr = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			arr[i] = scr.nextInt();
		}
	
		System.out.println("Array elements are...");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		} 
	}

}
