package labManual;

import java.util.Scanner;

public class Exercise4 {
	 public static void main(String args[]){   
		 Scanner sc = new Scanner(System.in);
		  int i,m=0,flag=0,n;   
		  System.out.println("Enter the number to be checked:"); 
		  n=sc.nextInt();  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println("Not a prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println("Not a prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   {
			   System.out.println("Is a prime number"); }  
		  }
		  sc.close();
		}    
}
