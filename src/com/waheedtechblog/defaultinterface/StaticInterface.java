/**
 * 
 */
package com.waheedtechblog.defaultinterface;

/**
 * @author abdulwaheed18@gmail.com
 *
 */
public interface StaticInterface {

	default int multiply(int num1, int num2) {
		return num1 * num2;
	}

	static int mod(int num1, int num2) {
		return num1 % num2;
	}
}
