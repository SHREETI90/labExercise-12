package labManual2;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {
	public static void main(String[] args) 
	{
		int n, i;
		Exercise2 ob = new Exercise2();
		System.out.println("Enter number of elements in the array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the String:");
		String[] arr = new String[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		Exercise2.sortStrings(arr);
		System.out.println("Output:");
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static String[] sortStrings(String arr[]) {
		Arrays.sort(arr);
		String s1, s2;
		int mid;
		for(int i = 0; i < arr.length; i++) {
			mid = (int) Math.ceil(arr[i].length()/2.0);
			s1 = (arr[i].substring(0,mid)).toUpperCase();
			s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
			arr[i] = s1 + s2;
		}
		return arr;
	}
}
