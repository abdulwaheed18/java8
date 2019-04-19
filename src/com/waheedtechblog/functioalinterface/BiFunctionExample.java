package com.waheedtechblog.functioalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> area = (a, b) -> a * b;

		System.out.println("Area of Rectangle: " + area.apply(5, 10));

	}

}
