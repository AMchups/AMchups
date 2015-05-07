/**
 * 
 */
package org.cuatrovientos.person;

/**
 * Main class for the project
 * @author Yeray García
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		person onePerson = new person();
		onePerson.name = "Bart";
		onePerson.age = 12;
		
		System.out.println(onePerson.sayHello());
		Student oneStudent = new Student();
		oneStudent.name = "Daniel";
		

	}

}
