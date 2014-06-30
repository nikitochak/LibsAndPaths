package com.sirma.itt.javacourse.bignums;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

/**
 * Tests the method in the class for summing two long numbers.
 * 
 * @author Nikolay Ch
 * 
 */
public class SumOfBigNumsTest {

	/**
	 * Tests the summing of two long numbers. Makes a string of the sum and
	 * compares it.
	 */
	@Test
	public void testSumLongNumbers() {
		char[] first = new char[5];
		char[] second = new char[5];
		char[] third = new char[5];
		String sum = "4";
		for (int i = 0; i < 5; i++) {
			first[i] = (char) (i + '0');
			second[4 - i] = (char) (i + '0');
		}
		third = SumOfTwoNumbers.sumLongNumbers(first, second);
		for (int i = 1; i < 5; i++) {
			sum += third[i];

		}

		assertEquals(sum, "44444");

	}

}
