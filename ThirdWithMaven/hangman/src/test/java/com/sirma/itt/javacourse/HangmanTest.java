package com.sirma.itt.javacourse;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the hang man method for searching for a character.
 * 
 * @author Nikolay Ch
 * 
 */
public class HangmanTest {

	/**
	 * Tests the method with one character which is contained in the word and
	 * one which is not.
	 */
	@Test
	public void testIsThere() {
		char[] word = new char[5];
		boolean[] wordGuess = new boolean[5];
		for (int i = 0; i < 5; i++) {
			word[i] = (char) (i + '0');
			wordGuess[i] = false;
		}

		assertTrue(Help.isThere(word, wordGuess, '3', 5, false));
		assertFalse(Help.isThere(word, wordGuess, '5', 5, false));
	}

}
