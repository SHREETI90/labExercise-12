package labManual;

import java.util.Scanner;

public class Exercise6 {
	static int calculateDifference(int n){

		int l, k, m;

			l = (n * (n + 1) * (2 * n + 1)) / 6;
			

			k = (n * (n + 1)) / 2;
			
			k = k * k;
			
			m = Math.abs(l - k);
			
			return m;

		}


		public static void main(String s[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n= sc.nextInt();
			System.out.println(calculateDifference(n));	
			sc.close();
		}
}
