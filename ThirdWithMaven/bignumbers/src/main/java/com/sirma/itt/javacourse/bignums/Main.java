package com.sirma.itt.javacourse.bignums;

/**
 * Main class which finds the sum of a random numbers with random length and
 * prints the value.
 * 
 * @author Nikolay Ch
 */
public class Main {

	/**
	 * Main method which declares and initializes two char arrays with random
	 * values but only numbers. Declares third char array, as well, in which
	 * will be kept the sum of the others two. Starts with the last elements of
	 * the first two arrays and sums their values. The result goes in the third
	 * array with the relevant index,as starts with the last. Prints the third
	 * array where is the sum of the previous two.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * The sizes of the first two numbers;
		 */
		int size1 = (int) (Math.random() * 30 + 2);
		int size2 = (int) (Math.random() * 10 + 2);
		int size3 = Math.max(size1, size2) + 1;

		/*
		 * The three numbers. First+second=third;
		 */

		char[] first = new char[size1];
		char[] second = new char[size2];
		char[] third = new char[size3];
		/*
		 * Initializes the two numbers.
		 */
		for (int i = 0; i < size1; i++) {
			first[i] = (char) (Math.random() * 9 + '0');
		}
		for (int i = 0; i < size2; i++) {
			second[i] = (char) (Math.random() * 9 + '0');
		}
		System.out.println(first);
		System.out.println(second);
		/*
		 * Sums the numbers.
		 */

		boolean isAbove10 = false;// variable keeps if the sum is above 10
		int value = 0;
		for (int i = size1 - 1, j = size2 - 1, k = size3 - 1; k - 1 >= 0; i--, j--, k--) {

			if (isAbove10 == true)
				value = 1;
			else
				value = 0; // if the previous sum is higher than 10 the value
							// starts with 1

			if (i < 0) {
				value = value + (int) (second[j] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else {
					isAbove10 = false;
				}
			} else if (j < 0) {
				value = value + (int) (first[i] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else {
					isAbove10 = false;
				}
			} else {
				value = value + (int) (first[i] - '0')
						+ (int) (second[j] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else
					isAbove10 = false;
			}

			third[k] = (char) (value + '0');
		}

		// prints the sum
		System.out.print("Here is the sum: ");
		for (int i = 0; i < size3; i++) {
			if (i != 0 || third[0] != '0') {
				System.out.print(third[i]);
			}
		}
	}

}
