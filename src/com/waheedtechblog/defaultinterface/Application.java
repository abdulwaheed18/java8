/**
 * 
 */
package com.waheedtechblog.defaultinterface;

/**
 * Tester class to test default and static implementation
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		Operation operation = new OperationImpl();

		System.out.println("Add Operation: " + operation.add(num1, num2));
		System.out.println("Sub Operation: " + operation.sub(num1, num2));

		// calling default Method
		System.out.println("Multiply operation: " + operation.multiply(num1, num2));
		
		//Calling static method
		System.out.println("Mod operation: " + StaticInterface.mod(num1, num2));

	}

}
