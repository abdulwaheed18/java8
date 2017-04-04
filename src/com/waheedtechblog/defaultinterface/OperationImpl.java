/**
 * 
 */
package com.waheedtechblog.defaultinterface;

/**
 * Class implementing both interface
 *
 */
public class OperationImpl implements Operation, AnotherOperation {

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int num1, int num2) {
		return AnotherOperation.super.multiply(num1, num2);
		// return Operation.super.multiply(num1, num2);
		// return num1 * num2;
	}

}
