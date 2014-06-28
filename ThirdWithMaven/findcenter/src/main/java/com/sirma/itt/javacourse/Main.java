package com.sirma.itt.javacourse;

/**
 * The main class. It initializes an Array and finds its center of the weight.
 * 
 * @author Nikolay Ch
 * 
 */

public class Main {
	/**
	 * The main method. It finds the center by comparing the sum of the elements
	 * before the current element and the sum of the other elements without the
	 * current element. Where the difference between the two sums is the
	 * smallest there is the center.
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// declares the Array
		int[] Array = new int[5];
		// the variable for the sum of the elements
		int sum = 0;

		// initializes the Array

		for (int i = 0; i < 5; i++) {
			int value;

			value = (int) (Math.random() * 100) - 10;
			Array[i] = value;
			sum = sum + value;
			System.out.print(value + " ");

		}
		System.out.println();

		/*
		 * Finding the center element by the above described algorithm.
		 */

		int sum1 = 0;
		int differ = 0;
		int difference = sum;
		int sum2 = 0;
		for (int i = 0; i < 5; i++) {

			sum2 = (int) (sum - (sum1 + Array[i]));

			differ = Math.max(sum1, sum2) - Math.min(sum1, sum2);

			sum1 = sum1 + Array[i];

			if (difference < differ) {
				System.out.print("The center is in: " + i);
				break;
			} else
				difference = differ;
		}

	}
}
