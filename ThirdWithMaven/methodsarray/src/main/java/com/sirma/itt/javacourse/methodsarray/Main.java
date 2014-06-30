package com.sirma.itt.javacourse.methodsarray;

/**
 * This class is making an array with 10 elements. Invokes the methods declared
 * in Help.
 * 
 * @author Nikolay Ch.
 */
public class Main {
	public static void main(String[] args) {
		int[] array = new int[10];

		// Initializes the Array with random values.

		for (int i = 0; i < 10; i++) {
			int value;

			value = (int) (Math.random() * 100) - 10;
			array[i] = value;
		}
		// the variable which keeps the minimum element
		int min;
		// the variable which keeps the sum of the elements
		int sum;

		// Uses the method for finding the smallest value.

		min = Help.getMinElement(array);
		System.out.println("The minimum value is " + min);

		// Uses the method for finding the sum of the elements.

		sum = Help.getSum(array);
		System.out.println("The sum is " + sum);

		// Uses the method for printing each element.

		Help.printArray(array);

	}
}
