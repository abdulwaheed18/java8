/**
 * 
 */
package com.waheedtechblog.defaultinterface;

/**
 * Interface having both abstract as well as default method
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public interface Operation {

	public int add(int num1, int num2);

	public int sub(int num1, int num2);

	// Default method
	public default int multiply(int num1, int num2) {
		return num1 * num2;
	}

}
