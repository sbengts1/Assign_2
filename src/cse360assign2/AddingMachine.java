/*
 * Author: Sam Bengtson
 *
 * Class ID: 85141
 *
 * Assignment 2

 * This file contains the AddingMachine class and the supporting methods and 
 * variables as described in assignment 2.
 */

package cse360assign2;

/**
 * An adding machine that keeps track of a total amount and a history of
 * operations that were performed on that total amount.
 */
public class AddingMachine {

	/**
	 * The total amount that can be changed by {@link #add(int)},
	 * {@link #subtract(int)}, and {@link #clear()}.   
	 */
	private int total;
	
	/**
	 * A constructor for {@link AddingMachine} that sets the value of the total
	 * to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current value of the total.
	 * 
	 * @return the current value of the total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the supplied value to the total.
	 * 
	 * @param value the value to be added to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the supplied value from the total.
	 * 
	 * @param value the value that will be subtracted from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Returns a string that details the history of operations that were 
	 * performed on the total.
	 */
	public String toString () {
		return "";
	}

	/**
	 * Resets the value of the total to zero.
	 */
	public void clear() {
	
	}
}