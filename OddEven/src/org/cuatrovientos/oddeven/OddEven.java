/**
 * 
 */
package org.cuatrovientos.oddeven;

import java.util.Scanner;

/**
 * @author Yeray
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		System.out.println("Enter the number:");
		line = reader.nextLine();
		number =Integer.parseInt(line);
		
		if (number % 2 == 0) {
			System.out.println("number is even"); //par
			
		}
			
		else {
			System.out.println("numer is odd");//impar
		}
		

	}

}
