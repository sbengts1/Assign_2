/*
 * Author: Sam Bengtson
 *
 * Class ID: 85141
 *
 * Assignment 2

 * This file contains various methods used for testing the AddingMachine class.
 * 
 * https://github.com/sbengts1/Assign_2
 */

package cse360assign2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

/*
 * Used to test the AddingMachine class.
 */
class AddingMachineTest {

	/*
	 * Assert that the initial value of the total is zero.
	 */
	@Test
	void testGetTotal() {
		AddingMachine machine = new AddingMachine();
		assertTrue(machine.getTotal() == 0);
	}

	/*
	 * Assert that adding a value to the total updates it accordingly.
	 */
	@Test
	void testAdd() {
		int value = 5;
		AddingMachine machine = new AddingMachine();
		machine.add(value);
		assertTrue(machine.getTotal() == value);
	}

	/*
	 * Assert that subtracting a value from the total updates it accordingly.
	 */
	@Test
	void testSubtract() {
		int value = 3;
		AddingMachine machine = new AddingMachine();
		machine.subtract(value);
		assertTrue(machine.getTotal() == -value);
	}

	/*
	 * Assert that performing transactions creates the expected transactions 
	 * string.
	 */
	@Test
	void testToString() {
		AddingMachine machine = new AddingMachine();
		machine.add(4);
		machine.subtract(2);
		assertTrue(machine.toString().equals("0 + 4 - 2"));
	}

	/*
	 * Assert that clearing the machine resets the total and the transactions
	 * string to zero.
	 */
	@Test
	void testClear() {
		AddingMachine machine = new AddingMachine();
		machine.add(3);
		machine.add(6);
		machine.subtract(3);
		machine.subtract(1);
		machine.clear();
		assertTrue(machine.getTotal() == 0 && machine.toString().equals("0"));
	}

}
