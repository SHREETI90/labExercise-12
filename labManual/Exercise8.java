package labManual;

import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int n = sc.nextInt();
	    sc.close();

	    if (checkNumber(n)) {
	      System.out.println("Given number is power of two.");
	    } else {
	      System.out.printf("Given number is not a power of two.");
	    }
	  }

	  private static boolean checkNumber(int n) 
	  {

	    if (n % 2 != 0) 
	    {
	      return false;
	    } 
	    else 
	    {

	      for (int i = 0; i <= n; i++) 
	      {

	        if (Math.pow(2, i) == n) 
	        	return true;
	      }
	    }
	    return false;
	  }
}
