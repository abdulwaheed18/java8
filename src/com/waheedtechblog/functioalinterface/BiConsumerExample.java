package com.waheedtechblog.functioalinterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String, String> fullName = (fn, ln) -> System.out.println(fn.concat(" " + ln));

		fullName.accept("Abdul", "Waheed");
	}
}
