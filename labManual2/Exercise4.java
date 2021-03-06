package labManual2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		int n, i;
		Exercise4 ob = new Exercise4();
		System.out.println("Enter number of elements in the array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Output is :");
		ob.modifyArray(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] modifyArray(int arr[]) {
		Arrays.sort(arr);
		int i, j = 0, n = arr.length;
		for(i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		while(j < n) {
			arr[j++] = 0; 
		}
		
		for (i = 0; i < n-1; i++) {
            for (j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    	}
		return arr;
	}
}
