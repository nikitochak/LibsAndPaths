package com.sirma.itt.javacourse;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the methods in the class CenterOfWeight.
 * 
 * @author Nikolay Ch
 * 
 */
public class CenterOfWeightTest {

	/**
	 * Tests the method for finding the center of the weight.
	 */
	@Test
	public void testFindCenter() {
		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = 3;
		}

		assertEquals(3, CenterOfWeight.findCenter(array));
	}

}
