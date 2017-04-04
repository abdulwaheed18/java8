/**
 * 
 */
package com.waheedtechblog.defaultinterface;

/**
 * @author abdulwaheed18@gmail.com
 *
 */
public interface AnotherOperation {

	// Default method
	public default int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2);

}
