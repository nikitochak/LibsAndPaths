package com.sirma.itt.javacourse.strgen;

/**
 * The class that generates String by using the method random declared in class
 * Math.
 * 
 * @author Nikolay Ch
 */

public class GenerationOfWord {

	/**
	 * Generates first the length of the word and then its characters.
	 * 
	 * @return the generated String
	 */

	public static String generate(String gen) {

		// Generates the length of the word.Maximum length is 25 characters.
		// Minimum is 5 characters.

		int size;

		size = (int) (Math.random() * 20) + 5;

		// declares the char Array

		char[] word = new char[25];

		// Generates the letters of the word one by one by the Math.random
		// method.

		char lett;
		int val;

		for (int i = 0; i < size; i++) {
			val = 10;
			while (val >= 10 && val <= 18 || val >= 43 && val <= 48) {
				val = (int) (Math.random() * 72);
			}

			lett = (char) (val + '0');
			word[i] = lett;
		}

		// makes a String variable from the char Array

		gen = new String(word);

		// prints the generated string.
		return gen;

	}

}
