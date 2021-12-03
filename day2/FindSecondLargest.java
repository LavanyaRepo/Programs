package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Initialize the array
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// Get the length
		int length = data.length;
		// sort the array
		Arrays.sort(data);
		// Display the array
		System.out.println("Sorted Array");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		// Choose the second largest number using the appropriate index
		System.out.println("The second largest element:" + data[length - 2]);

	}

}
