/**
 * 
 */
package org.cuatrovientos.person;

/**
 * Represents a student
 * @author Yeray García
 * 
 *
 */
public class Student extends person {
	//Utilizaria todo lo de la clase person que es publico o protegido
	private String school;
	
	public Student () {
		school = "Cuatrovientos High School";
		
	}
	
	
	
	public void learn () {
		System.out.println("I`m learning");
		
	}
	
	

}
