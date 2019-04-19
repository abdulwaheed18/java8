package com.waheedtechblog.functioalinterface;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		// Calling Function Functional Interface without using Lambda Expression
		FunctionExample.GetStringLength function = new FunctionExample().new GetStringLength();
		System.out.println("Length of String is : " + function.apply("www.waheedtechblog.com"));

		// Using Lambda Expression
		Function<String, Integer> f1 = (name) -> name.length();
		System.out.println("Lambda Expression, Length of String is : " + f1.apply("www.waheedtechblog.com"));
	}

	class GetStringLength implements Function<String, Integer> {

		@Override
		public Integer apply(String name) {
			return name.length();
		}
	}
}
