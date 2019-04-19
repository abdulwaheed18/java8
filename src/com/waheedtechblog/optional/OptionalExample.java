package com.waheedtechblog.optional;

import java.util.Base64;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		OptionalExample optionalExample = new OptionalExample();

		// How to create empty Optional
		Optional<String> optional = Optional.empty();
		System.out.println("1. Optional: " + optional);

		// Check whether Optional object is empty
		System.out.println("2. Optional: " + optional.isPresent());

		// Can create Optional using Static Of method
		Optional<String> name = Optional.of("WaheedTechblog.com");
		System.out.println("3. Name: " + name.toString());

		/*
		 * Optional<String> nullValue = Optional.of(null);
		 * System.out.println("4. Name: " + nullValue.toString());
		 */

		// Can accept NUll value as well
		Optional<String> isNull = Optional.ofNullable("WaheedTechblog.com");
		System.out.println("5. Name: " + isNull.toString());

		// check isNull object contains some value
		if (isNull.isPresent()) {
			System.out.println("6. Optional object contains value: " + isNull.toString());
		}

		// Check whether object is empty or not
		Optional<String> nullValue = Optional.ofNullable(null);
		if (nullValue.isEmpty()) {
			System.out.println("7. Is Optional empty? " + nullValue.toString());
		}

		// Execute if Optional object exist else does nothing
		name.ifPresent(value -> System.out.println("8. Length of name: " + value.length()));

		// Set Default value if Object is empty
		String nullString = null;
		String testOrElse = Optional.ofNullable(nullString).orElse("This is default value");
		System.out.println("9. Print testorElse value: " + testOrElse);

		// Invoke Functional Interface if Optional Object is empty
		String testOrElseGet = Optional.ofNullable(nullString).orElseGet(() -> "waheedtechblog");
		System.out.println("10. Print orElseGet value: " + testOrElseGet);

		// Checking the diff between orElse Vs orElseGet
		String testOrElseDiff = Optional.ofNullable("waheedtechblog").orElse(optionalExample.getDbConnection());
		System.out.println("12. Print testorElse value: " + testOrElseDiff);

		String testOrElseGetDiff = Optional.ofNullable("waheedtechblog").orElseGet(optionalExample::getDbConnection);
		System.out.println("13. Print orElseGet value: " + testOrElseGetDiff);

		// Throw runtime exception if Optional value is not present
		try {
			String orElseThrowTest = Optional.ofNullable(nullString).orElseThrow(RuntimeException::new);
		} catch (Exception ex) {
			// Handle error here
			// System.err.println("14. Error Message: " + ex);
		}

		Optional<String> getTest = Optional.ofNullable("waheedtechblog");
		System.out.println("15. GetTest value: " + getTest.get());

		// filteration on Optional
		Optional<String> username = Optional.of("waheedtechblog");
		boolean isLengthValid = username.filter(str -> str.length() > 5).isPresent();
		System.out.println("16. is Length Valid: " + isLengthValid);

		// map to perform operation on Optional
		Optional<String> password = Optional.of("waheedtechblog");
		String encodedPassword = password.map(str -> Base64.getEncoder().encodeToString(str.getBytes())).get();
		System.out.println("17. Encoded Password: " + encodedPassword);

		// first do validation and then operation on Optional object
		String validatedEncodedPassword = password.filter(ps -> ps.length() > 15)
				.map(str -> Base64.getEncoder().encodeToString(str.getBytes())).toString();
		System.out.println("18. Validated Encoded Password: " + validatedEncodedPassword);
		
		// first do validation and then operation on Optional object
		String validatedFlatEncodedPassword = password.filter(ps -> ps.length() > 15)
				.map(str -> Base64.getEncoder().encodeToString(str.getBytes())).toString();
		System.out.println("18. Validated Encoded Password: " + validatedFlatEncodedPassword);

	}

	private String getDbConnection() {
		System.out.println("11. Invoking Default fucntion");
		return "Create db Connection";
	}

}
