package main.java.com.sirma.itt.javacourse.second;

import java.io.IOException;

/**
 * Class which runs the methods from jar files.
 * 
 * @author Nikolay Ch
 *
 */
public class ReadFromJar {
	
	
	/**
	 * The main method which runs all the main methods in the jar files.
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
	
		System.out.println();
		System.out.println("Now array reverse:");
		main.java.com.sirma.itt.javacourse.arrayreverse.Main.main(null);
		System.out.println();
		System.out.println("Now the hangman:");
		main.java.com.sirma.itt.javacourse.hangman.Main.main(null);
		System.out.println();
		System.out.println("Now the gcd:");
		main.java.com.sirma.itt.javacourse.gcd.Nod.main(null);
		System.out.println();
		System.out.println("Now the bignumbers:");
		main.java.com.sirma.itt.javacourse.bignumbers.Main.main(null);
		System.out.println();
		System.out.println("Now the find center array:");
		main.java.com.sirma.itt.javacourse.findcenter.Main.main(null);
		System.out.println();
		System.out.println("Now the generation of the string:");
		main.java.com.sirma.itt.javacourse.strgen.Main.main(null);
		
		main.java.com.sirma.itt.javacourse.methodsarray.Main.main(null);
	
	
	
	}
	
	
}
