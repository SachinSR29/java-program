package com.program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		
		int number = scanner.nextInt();
		
		 if (isPrime(number))   
	       {    
	           System.out.println(number + " is a prime");    
	       }   
	       else   
	       {    
	   System.out.println(number + " is not a prime");    
	       }    

	}

		static boolean isPrime(int n)   
		{    
		    if (n <= 1)     
		           return false;    
		       for (int i = 2; i <= Math.sqrt(n); i++)   
		           if (n % i == 0)   
		               return false;    
		       return true;    
		   }    

}
