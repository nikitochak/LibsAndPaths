package com.sirma.itt.javacourse.methodsarray;

/**
 * The main class which is making an object from the Help type. Calls the
 * methods declared in Help.
 * 
 * @author Nikolay Ch.
 */
public class Main {
	public static void main(String[] args) {
		/*
		 * Makes an object.
		 */
		Help ob = new Help();

		/*
		 * Initializes the Array with random values.
		 */

		for (int i = 0; i < 10; i++) {
			int value;

			value = (int) (Math.random() * 100) - 10;
			ob.Array[i] = value;
		}
		// the variable which keeps the minimum element
		int min;
		// the variable which keeps the sum of the elements
		int sum;
		/*
		 * Uses the method for finding the smallest value.
		 */
		min = ob.getMinElement(ob.Array);
		System.out.println("The minimum value is " + min);
		/*
		 * Uses the method for finding the sum of the elements.
		 */
		sum = ob.getSum(ob.Array);
		System.out.println("The sum is " + sum);
		/*
		 * Uses the method for printing each element.
		 */
		ob.printArray(ob.Array);

	}
}
