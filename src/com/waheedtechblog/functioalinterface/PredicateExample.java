package com.waheedtechblog.functioalinterface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		// Calling Functional Interface without using Lambda Expression
		PredicateExample.ComparisionPredicate predicate = new PredicateExample().new ComparisionPredicate();
		System.out.println("Is x greater than 10: " + predicate.test(15));

		// Using Lambda Expression
		Predicate<Integer> p1 = I -> I > 10;
		System.out.println("Lambda Expression, Is X greater than 10: " + p1.test(15));

		// Using Lambda Expression
		Predicate<String> p2 = S -> S.length() > 5;
		System.out.println("Is String length greater than 5: " + p2.test("Waheed"));
	}

	class ComparisionPredicate implements Predicate<Integer> {

		@Override
		public boolean test(Integer x) {
			if (x > 10) {
				return true;
			} else {
				return false;
			}
		}

	}

}
