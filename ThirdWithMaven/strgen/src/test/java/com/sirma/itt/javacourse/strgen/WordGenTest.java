package com.sirma.itt.javacourse.strgen;

import org.testng.annotations.Test;
import org.testng.Assert;


/**
 * Tests the method for generating new word.
 * 
 * @author Nikolay Ch
 * 
 */
public class WordGenTest {

	/**
	 * Tests if a new word is generated.
	 */
	@Test
	public void test() {
		String word = "asdf";
		word = GenerationOfWord.generate(word);
		if (word.equals("asdf")) {
			Assert.fail("Not");
		}
	}

}
