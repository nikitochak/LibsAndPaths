package com.sirma.itt.javacourse;

/**
 * This class reverses the elements of an array.
 * 
 * @author Nikolay Ch
 */
public class ArrayReverse {

	/**
	 * Initializes an array.
	 */
	public static void initializeArray(int[] array) {

		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
	}

	/**
	 * 
	 * Reversing the array by finding the middle element and changing the
	 * values.
	 * 
	 * @param array
	 *            the array which elements we want to reverse
	 */
	public static void reverseArray(int[] array) {

		int middle = (int) (array.length / 2);
		int len = array.length - 1;

		for (int i = 0; i <= middle; i++) {
			int k;
			k = array[i];

			array[i] = array[len - i];
			array[len - i] = k;

		}

	}

	/**
	 * Prints the array.
	 * 
	 * @param array
	 *            the array which we want to print
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i <= array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
