package com.sirma.itt.javacourse;

/**
 * This class reverses the elements of an array.
 * 
 * @author Nikolay Ch
 */
public class Main {
	
	/**
	 * This is the main method which declares and initializes an array.
	 * Finds the middle element of the array and starts changing the positions of the array.
	 * The element with index i gets the value of the element with index array's length minus i.
	 * This repeats while i is smaller or equal to the middle element. 
	 * After that prints the reversed array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] Array = new int[5];

		/*
		 * Initializing the Array
		 */

		for (int i = 0; i < 5; i++) {
			int value;

			value = (int) (Math.random() * 100) - 10;
			Array[i] = value;
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		/*
		 * Reversing the array by finding the middle element and changing the
		 * values.
		 */
		int middle = (int) (Array.length / 2);
		int len = Array.length-1;
		
		
		for (int i = 0; i <= middle; i++) {
			int k;
			k = Array[i];
			
			Array[i] = 	Array[len - i];
			Array[len - i] = k;

		}

		
		 // prints the reversed Array
		 

		for (int i = 0; i <=len; i++) {
			System.out.print(Array[i] + " ");
		}
	}
}
