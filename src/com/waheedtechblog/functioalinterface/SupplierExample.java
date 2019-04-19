package com.waheedtechblog.functioalinterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		// Calling Supplier Functional Interface without using Lambda Expression
		SystemDate date = new SystemDate();
		System.out.println("System Date: " + date.get());

		// Using Lambda Expression
		Supplier<Date> supplier = () -> new Date();
		System.out.println("Using lambda, System Date: " + supplier.get());
	}

}

class SystemDate implements Supplier<Date> {

	@Override
	public Date get() {
		return new Date();
	}

}
