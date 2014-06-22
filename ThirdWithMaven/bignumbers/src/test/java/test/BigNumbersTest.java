package test;

import org.testng.annotations.Test;

import com.sirma.itt.javacourse.bignums.Main;
/**
 * Class which test the class for summing big numbers.
 * @author Nikolay Ch
 *
 */
public class BigNumbersTest {
  /**
   *Void method which test the main method for calculating the sum of big numbers.  
   */
@Test
  public void TestSumBigNumbers() {
	  Main.main(null);
	  
  }
}
