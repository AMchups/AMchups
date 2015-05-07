package org.cuatrovientos.person;
/**
 * Represents a regular person
 * @author Yeray García
 *
 */

public class person {
	
	public String name;
	protected int age;
	private String phone;
	/**
	 * Default constructor
	 */
	public person () {
		name = "Rutiger";
		age = 42;
		phone = "666000666";
		
		
	}
	
	/**
	 * Says hello
	 * @return
	 */
	
	public String sayHello () {
		return "Hello";
		
	}
	
	/**
	 * returns hello
	 * @return
	 */
	
	private String hello () {
		return "hello";
		
	}
	

}
