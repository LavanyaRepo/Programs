package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// To find whether a number is a Prime number or not

		int num =3, m;
		boolean flag = false;
		m = num/2;
		
		// condition for non prime number
	   for (int i = 2; i < m; i++) {
		   
		   if (num % i == 0) {
			   flag = true;  
			   break;
		   }
	   }
	   if (flag== false) 
		   System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	   	
	   
	}  
}
