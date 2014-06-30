package com.sirma.itt.javacourse;

/**
 * 
 * This is help class with some static methods. The first initializes char array
 * with random characters but only numbers and letters. The second checks if a
 * char character is consisted in a word (char array). The third prints the
 * characters of the word but only these which are guessed.
 * 
 * @author Nikolay Ch
 * 
 */

public class Help {

	/**
	 * This is void method which initializes a char array with random values.
	 * Initializes an boolean array as in the beginning only the first and last
	 * values are true.
	 * 
	 * 
	 * 
	 * @param word
	 *            the char array which must be initialized
	 * @param wordGuess
	 *            the boolean array
	 * @param size
	 *            the length of both arrays
	 */
	public static void wordGen(char[] word, boolean[] wordGuess, int size) {

		char lett;
		int val;

		for (int i = 0; i < size; i++) {
			val = 10;
			while (val >= 10 && val <= 18 || val >= 43 && val <= 48) {
				val = (int) (Math.random() * 72);
			}

			lett = (char) (val + '0');
			word[i] = lett;
			wordGuess[i] = false;
			wordGuess[0] = true;
			wordGuess[size - 1] = true;
		}

	}

	/**
	 * Returns if the word contains the character. If it is true, the element
	 * with index equal to the index where the character is in the word(char
	 * array) becomes true.
	 * 
	 * @param word
	 *            the char array in which we are looking for the character
	 * @param wordGuess
	 *            the boolean array which keeps if the characters of the word
	 *            are guessed
	 * @param in
	 *            the character which the method checks if is consisted in the
	 *            word
	 * @param size
	 *            the length of the two arrays
	 * @param guss
	 *            the boolean variables which is returned and is true if the
	 *            character is consisted in the word
	 * @return @param guss
	 */
	public static boolean isThere(char[] word, boolean[] wordGuess, char in,
			int size, boolean guss) {

		for (int i = 0; i < size; i++) {
			if (word[i] == in) {
				guss = true;
				wordGuess[i] = true;
			}
		}
		return guss;
	}

	/**
	 * This method prints the elements of an Array.
	 * 
	 * @param word
	 *            the char array which elements will be printed.
	 * @param wordGuess
	 *            keeps if the element must be printed.
	 * @param size
	 *            the size of the array
	 */
	public static void printWord(char[] word, boolean[] wordGuess, int size) {
		for (int i = 0; i < size; i++) {
			if (wordGuess[i] == true) {
				System.out.print(word[i] + " ");

			} else {
				System.out.print("_ ");
			}
		}
	}
}
