/*
 * Author: Sam Bengtson
 *
 * Class ID: 85141
 *
 * Assignment 2

 * This file contains the AddingMachine class and the supporting methods and 
 * variables as described in assignment 2.
 * 
 * https://github.com/sbengts1/Assign_2
 */

package cse360assign2;

/**
 * An adding machine that keeps track of a total amount and a history of
 * transactions that were performed on that total amount.
 */
public class AddingMachine {

	/**
	 * The total amount that can be changed by {@link #add(int)},
	 * {@link #subtract(int)}, and {@link #clear()}.   
	 */
	private int total;
	
	/**
	 * A string that stores the history of all transactions performed on the 
	 * total.
	 */
	private String transactions;
	
	/**
	 * A constructor for {@link AddingMachine} that sets the value of the total
	 * and the value of the transactions string to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		transactions = "0";
	}
	
	/**
	 * Returns the current value of the total.
	 * 
	 * @return the current value of the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the supplied value to the total and updates the transactions string
	 * to include the add operation.
	 * 
	 * @param value the value to be added to the total
	 */
	public void add (int value) {
		total += value;
		transactions += " + " + String.valueOf(value);
	}
	
	/**
	 * Subtracts the supplied value from the total and updates the transactions
	 * string to include the subtract operation.
	 * 
	 * @param value the value that will be subtracted from the total
	 */
	public void subtract (int value) {
		total -= value;
		transactions += " - " + String.valueOf(value);
	}
	
	/**
	 * Returns the transactions string which details the history of 
	 * transactions performed on the total.
	 */
	public String toString () {
		return transactions;
	}

	/**
	 * Resets the value of the total and the value of the transactions string
	 * to zero.
	 */
	public void clear() {
		total = 0;
		transactions = "0";
	}
}