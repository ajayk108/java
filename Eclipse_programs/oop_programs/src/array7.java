/*
 * passing array as arguments in Methods .........
 */
public class array7 {
	
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,4,5};
		
		printArray(arr);
		
		
		
	}

}
