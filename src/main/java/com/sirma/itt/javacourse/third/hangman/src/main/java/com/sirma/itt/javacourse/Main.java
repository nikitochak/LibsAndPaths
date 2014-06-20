package com.sirma.itt.javacourse;

import java.io.IOException;

/**
 * This is the main class. It represents a game. It generates random word and
 * the user tries to guess it by inputing characters until he guess the word or
 * his lives finish.
 * 
 * @author Nikolay Ch
 */
public class Main {
	/**
	 * The main method which generates and initializes two arrays. The first is
	 * for the word and the second keeps which characters are guessed. The user
	 * inputs a characters and it checks if he is guessed. This is continuing
	 * until the customer guess the word or he dies (his lives are finished).
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * Generates the size of the word.
		 */
		int size = (int) (Math.random() * 20 + 5);

		System.out.println("The word has " + size + " letters.");
		/*
		 * Declares one char Array for the word characters. Declares one boolean
		 * array which keeps which characters are guessed.
		 */
		boolean[] wordGuess = new boolean[25];
		char[] word = new char[25];

		/*
		 * Initializes the arrays.
		 */
		Help.wordGen(word, wordGuess, size);

		/*
		 * Integer variable which keeps the lives. The boolean variable which
		 * keeps whether the word is guessed. Integer variable which keeps the
		 * result of the function. Inputs a character and checks if it exists in
		 * the word.
		 */

		int lives = 10;
		boolean result;

		while (true) {
			System.out.println("You have " + lives + " lives");
			Help.printWord(word, wordGuess, size);
			System.out.println();
			System.out.println("Input a letter.");
			char chInput;
			do {
				chInput = (char) System.in.read();
			} while (chInput == '\n' || chInput == '\r');

			result = Help.isThere(word, wordGuess, chInput, size, false);

			if (result == false) {
				lives = lives - 1;
				System.out.println("No this character is not in the word. "
						+ result);
			} else {
				System.out.println("Yes you guessed." + result);
			}
			if (lives <= 0) {
				break;
			}

		}

		System.out.println("You are hanged.");
		System.out.println(word);

	}
}
