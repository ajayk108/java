/*
 *  2-D jagged array .................
 */
public class array6 {
	
	public static void main(String[] args)
	{
		int arr[][] = new int[2][]; //Declaring 2D array with 2 rows..
		
		//Making the above array Jagged....
		arr[0] = new int[3]; //first row has 3 columns
		arr[1] = new int[2]; //second row has 2 columns				
	
		//initializing array...
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = count++;
			}
		}
		
		//Displaying the values of 2D array..
		System.out.println("contents of 2D array are....");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}
	

}
