/**
 * 
 */
package org.cuatrovientos.javakart;

import java.util.Vector;

/**
 * Represents a race
 * @author Pello Altadill
 *
 */
public class Race {
	private String name;
	private Circuit circuit;
	private Vector<Vehicle> vehicles;
	private Vector<Integer> positions;
	
	/**
	 * constructor
	 * @param name
	 * @param circuit
	 */
	public Race (String name, Circuit circuit) {
		this.name = name;
		this.circuit = circuit;
		vehicles = new Vector<Vehicle>();
		positions = new Vector<Integer>();
	}
	
	/**
	 * add vehicle to race
	 * @param vehicle
	 */
	public void addVehicle (Vehicle vehicle) {
		vehicles.add(vehicle);
		positions.add(0);
	}
	
	public Vehicle race () {
		Vehicle winner = null;
		
		for (int i = 0; i < vehicles.size();i++) {
			int movement = vehicles.elementAt(i).move();
			int current = positions.elementAt(i);
			int newPosition = movement + current;
			
			positions.setElementAt(newPosition, i);
			
			if (newPosition >= circuit.getLength()) {
				winner = vehicles.elementAt(i);
				break;
			}
		}
		
		return winner;
	}
}
