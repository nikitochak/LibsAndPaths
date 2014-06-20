package com.sirma.itt.javacourse.strgen;

/**
 * The main class. It generates String by using the method random declared in
 * class Math.
 * 
 * @author Nikolay Ch
 */

public class Main {

	/**
	 * The main method.
	 * 
	 * @return the generated String
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * Generates the length of the word.Maximum length is 25 characters.
		 * Minimum is 5 characters.
		 */

		int size;

		size = (int) (Math.random() * 20) + 5;
		System.out.println("The size of the word is " + size + " characters.");

		// declares the char Array

		char[] word = new char[25];
		/*
		 * Generates the letters of the word one by one by the Math.random
		 * method.
		 */

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

		String gen = new String(word);

		// prints the generated string.
		System.out.print(gen);

	}

}
