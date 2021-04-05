package labManual;

import java.util.Scanner;

public class Exercise1 {
	public static int sumOfSeries(int n) 
	{
		int sum=0;
		for(int x=1;x<=n;x++)
			sum += x*x*x;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Cube of the given Number is:"+sumOfSeries(n));
	}
}
