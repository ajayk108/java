/*
 * Lets see some more simple examples...
 */
public class array2 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];// declaration and instantiation..
		arr[0] = 10; // initialization..
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//printing the array....
		for(int i=0; i<arr.length; i++)//length is the property of array  
			System.out.print(arr[i]+" ");
	}

}
