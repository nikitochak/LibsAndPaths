package com.sirma.itt.javacourse.methodsarray;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.sirma.itt.javacourse.methodsarray.Help;

/**
 * Tests some methods for arrays.
 * 
 * @author Nikolay Ch
 * 
 */
public class MethodsArrayTest {

	/**
	 * Tests the method for finding the minimum element of an array.
	 */
	@Test
	public void testGetMinElementOfArray() {
		Help meth = new Help();
		for (int i = 0; i < 10; i++) {
			meth.Array[i] = i;
		}
		if (meth.getMinElement(meth.Array) != 0) {
			Assert.fail("Nope");
		}
		;
	}

	/**
	 * Test the method for finding the sum of an array.
	 */
	@Test
	public void testGetSumOfArray() {
		Help meth = new Help();
		for (int i = 0; i < 10; i++) {
			meth.Array[i] = i;
		}
		if (meth.getSum(meth.Array) != 45) {
			Assert.fail("nope");
		}
	}

}
