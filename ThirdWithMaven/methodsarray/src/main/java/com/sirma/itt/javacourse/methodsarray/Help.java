package com.sirma.itt.javacourse.methodsarray;

/**
 * Class which contains an Array and methods for finding the minimum element,
 * the sum of the elements and for printing the elements of the Array.
 * 
 * @author Nikolay Ch
 */
public class Help {

	public int Array[] = new int[10];

	/**
	 * Method for getting the minimum value of an Array. Cycles through the
	 * Array's elements and checks if the current element is smaller than the
	 * minimum element until it. If it is so, the variable for the minimum
	 * element gets the value of the current element.
	 * 
	 * @param the
	 *            array
	 * @return the minimum element of the Array
	 */

	public int getMinElement(int[] Array) {
		// the counter for the cycle
		int count;
		// the variable which keeps the minimum element
		int mini = 100;
		for (count = 0; count < 10; count++) {
			if (Array[count] < mini) {
				mini = Array[count];
			}
		}
		return mini;
	}

	/**
	 * Gets the sum of the elements in the Array. Cycles through the elements
	 * and sums the value of every element with the values of all elements
	 * before it.
	 * 
	 * @param the
	 *            Array
	 * @return the sum of the Arrays'elements
	 */
	public int getSum(int[] Array) {
		// the counter for the cycle
		int count;
		// variable which keeps the sum of the elements
		int sum = 0;
		for (count = 0; count < 10; count++) {
			sum = sum + Array[count];
		}
		return sum;
	}

	/**
	 * Prints the elements of an Array.
	 * 
	 * @param the
	 *            Array
	 */

	public void printArray(int[] Array) {
		// the counter for the cycle
		int count;

		for (count = 0; count < 10; count++) {
			System.out.print("The value with index:" + count + " is "
					+ Array[count]);
			System.out.println();
		}

	}

}
