package week1.day1;

public class PrimeNum_NegativeandPositive_testcases {
	
	public static boolean isPrimeNumber(int num) {
		
		// all corners- negative and positive test cases
		if(num<=1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i ==0) {
				return false;		
			}		
		}
		return true;	
	}
	
	public static void getPrimeNumber(int num) {
		
		for (int i = 2; i <= num; i++) {
			
			if (isPrimeNumber(i)) {
				System.out.print(i+ " ");	// 2 3 5 7 11 13 		
			}
		}	
	}

	public static void main(String[] args) {
		
		System.out.println("2 is prime number: "+isPrimeNumber(2)); //true
		System.out.println("10 is prime number: "+isPrimeNumber(10)); //true
		System.out.println(isPrimeNumber(-5)); //false
		getPrimeNumber(13); // 2 3 5 7 11 13 

	}

}
