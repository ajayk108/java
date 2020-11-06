/*
 * multidimensional array.....
 */

import java.util.Scanner;

public class array5 {

	public static void main(String[] args)
	{
		int arr[][] = new int[2][2];
		
		Scanner scr = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j] = scr.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
