package labManual2;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 
{
	public static void main(String[] args) 
	{
		
	
	int n;
	Exercise1 ob = new Exercise1();
	System.out.println("Enter number of elements in the array");
	
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	System.out.println("Enter the elements:");
	int arr[] = new int[n];
	for(int i = 0; i < n; i++) 
	{
		arr[i] = sc.nextInt();
	}
	sc.close();
	System.out.println("The second smallest element in the array is: "+ ob.getSecondSmallest(arr));
	}

	public int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	

}
