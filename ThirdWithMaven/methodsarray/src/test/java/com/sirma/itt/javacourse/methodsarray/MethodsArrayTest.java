package com.sirma.itt.javacourse.methodsarray;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

/**
 * Tests some methods involved with arrays.
 * 
 * @author Nikolay Ch
 * 
 */
public class MethodsArrayTest {

	/**
	 * Tests the methods for finding the minimum element of an array.
	 */
	@Test
	public void testGetMin() {
		int[] array2 = { -245, 3245, 4, 435, 234, -54 };
		assertEquals(-245, Help.getMinElement(array2));
	}

	/**
	 * Tests the method for summing the elements of an array.
	 */
	@Test
	public void testGetSum() {
		int[] array = { 1, 1, 1, 1, 1, 1, 1 };
		assertEquals(Help.getSum(array), 7);
	}

}
