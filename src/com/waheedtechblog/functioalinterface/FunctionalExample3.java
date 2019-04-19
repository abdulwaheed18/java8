package com.waheedtechblog.functioalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalExample3 {

	public static void main(String[] args) {

		FunctionalExample3 functioalExample3 = new FunctionalExample3();

		// return the name of Student
		Function<Student, String> f1 = student -> student.getName();
		// return name in uppercase
		Function<String, String> f2 = name -> name.toUpperCase();

		Function<Student, Student> f3 = student -> {
			String name = "Adding via Compose " + student.getName();
			return new Student(name, student.getAge());
		};

		Function<String, String> f4 = Function.identity();

		// andThen default method
		System.out.println("=============================");
		System.out.println("=====USING andThen Default Function======");
		List<Student> students = functioalExample3.populateStudentList();
		for (Student student : students) {
			System.out.println("Student Name: " + f1.andThen(f2).apply(student));
		}

		// compose default method
		System.out.println("\n");
		System.out.println("=============================");
		System.out.println("=====USING default COMPOSE FUNCTION======");
		for (Student student : students) {
			System.out.println("Student Name: " + f1.compose(f3).apply(student));
		}

		// Identity Static method
		System.out.println("\n");
		System.out.println("=============================");
		System.out.println("=====Identity Static method======");
		for (Student student : students) {
			System.out.println("Student Name: " + f4.apply(student.getName()));
		}

	}

	public List<Student> populateStudentList() {
		List<Student> studentList = Arrays.asList(new Student("Abdul", 31), new Student("Waheed", 29),
				new Student("DummyUser", 20), new Student("Adam", 25));
		return studentList;
	}

}
