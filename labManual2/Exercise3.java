package labManual2;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {
	public static void main(String[] args) {
		int n, i;
		Exercise3 ob = new Exercise3();
		System.out.println("Enter number of elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Output:");
		ob.getSorted(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] getSorted(int arr[]) {
		int reverse;
		for(int i = 0; i < arr.length; i++) {
			reverse = 0;
			while(arr[i] != 0) {
				int digit = arr[i] % 10;
				reverse = (reverse * 10) + digit;
				arr[i] /= 10;
			}
			arr[i] = reverse;
		}
		Arrays.sort(arr);
		return arr;
	}
}
