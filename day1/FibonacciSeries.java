package week1.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// To find Fibonacci Series for a given range
		// EX: FibonacciSeries- 0, 1, 1, 2, 3, 5, 8, 13, 21
		
		int firstnum, secnum, sum, range;
		//int range=7;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range:");
		range = sc.nextInt();
		
		firstnum =0;
		secnum =1;
		System.out.print(firstnum+ " "+ secnum);
		
		for (int i = 0; i < range; i++) {
			
			sum = firstnum+secnum;	
			System.out.print(" "+sum);
			firstnum =secnum;
			secnum =sum;
			
		}
		
	}
}
//o/p-----
//Enter the range:
//7
//0 1 1 2 3 5 8 13 21
