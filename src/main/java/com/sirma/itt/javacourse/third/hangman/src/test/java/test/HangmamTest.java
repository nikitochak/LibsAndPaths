package test;

import org.testng.annotations.Test;

import com.sirma.itt.javacourse.Help;

/**
 * Test methods for generating a random word.
 * 
 * @author Nikolay Ch
 *
 */
public class HangmamTest {
	private int size=(int) (Math.random()*10+5); // random size of the word
	char[] word=new char[size];
	boolean[] guess=new boolean[size];
	
  /**
   *Checks if the method is generating a random word.
   *The size of the word is random. 
   */
@Test
  public void TestWordGen() {
	  Help.wordGen(word,guess,size);
	  for(int i=0;i<size;i++){
		  System.out.print(word[i]);
	  }
	  }
}
