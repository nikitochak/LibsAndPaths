package com.sirma.itt.javacourse;

/**
 * It initializes an Array and finds its center of the weight.
 * 
 * @author Nikolay Ch
 * 
 */

public class CenterOfWeight {
	public static int sum = 0;

	/**
	 * Initializes an array.
	 * 
	 */
	public static void initialize() {
		// declares the Array
		int[] Array = new int[5];
		// the variable for the sum of the elements

		// initializes the Array

		for (int i = 0; i < 5; i++) {
			int value;

			value = (int) (Math.random() * 100) - 10;
			Array[i] = value;
			sum = sum + value;
			System.out.print(value + " ");

		}
		System.out.println();
	}

	/**
	 * Finds the center of an array. Look where the sum of the previous elements
	 * is closest to the sum of the rest elements without the current.
	 * 
	 * @param array
	 *            the array which center we are searching
	 * @return the index where the center is
	 */
	public static int findCenter(int[] array) {

		int sum1 = 0;
		int differ = 0;

		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		int difference = sum;
		for (int i = 0; i < 5; i++) {

			sum2 = (int) (sum - (sum1 + array[i]));// the sum after the current
													// element

			differ = Math.max(sum1, sum2) - Math.min(sum1, sum2); // the
																	// differences

			sum1 = sum1 + array[i]; // updating the sum before the current
									// element

			if (difference < differ) {

				return i;
			} else {

				difference = differ;
			}
		}
		return 0;
	}
}
