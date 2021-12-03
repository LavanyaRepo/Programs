package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// Here is the input
		int[] arr = { 1, 2, 3, 8, 4, 7, 6 };

		Arrays.sort(arr);
		System.out.println("sorted output");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			if (i + 1 != arr[i]) {
				int temp = i + 1;
				System.out.println("The missing number in the array is = " + temp);
				break;

			}

		}

	}

}
