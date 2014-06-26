package com.sirma.itt.javacourse.methodsarray;

import org.testng.annotations.Test;

import com.sirma.itt.javacourse.methodsarray.Help;


/**
 * Tests some methods for arrays.
 * 
 * @author Nikolay Ch
 *
 */
public class MethodsArrayTest {
 
/**
 *  Tests the method for finding the minimum element of an array.
 */
@Test 
  public void TestgetMinElementOfArray() {
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  System.out.println(meth.getMinElement(meth.Array));
  }
  /**
   *Test the method for finding the sum of an array. 
   */
@Test
  public void TestGetSumOfArray(){
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  System.out.println(meth.getSum(meth.Array));
  }
  
  @Test
  public void TestrpintArray(){
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  meth.printArray(meth.Array);
  }
}
