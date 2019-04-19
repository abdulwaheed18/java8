package com.waheedtechblog.functioalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExmaple2 {

	public static void main(String[] args) {

		PredicateExmaple2 predicate = new PredicateExmaple2();

		Predicate<Student> p3 = student -> student.getAge() > 30;
		Predicate<Student> p4 = student -> student.getName().startsWith("A");
		Predicate<Student> p5 = Predicate.isEqual(new PredicateExmaple2().new Student("Abdul", 31));

		List<Student> students = predicate.populateStudentList();
		for (Student student : students) {
			if (p3.test(student) && p4.test(student)) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student Age: " + student.getAge());
			}
		}
		System.out.println("\n");

		System.out.println("=============================");
		System.out.println("=====USING AND PREDICATE======");

		// Using AND PREDICATE
		for (Student student : students) {
			if (p3.and(p4).test(student)) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student Age: " + student.getAge());
			}
		}
		System.out.println("\n");

		System.out.println("=============================");
		System.out.println("=====USING OR PREDICATE======");

		// Using OR PREDICATE
		for (Student student : students) {
			if (p3.or(p4).test(student)) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student Age: " + student.getAge());
			}
		}
		System.out.println("\n");

		System.out.println("=============================");
		System.out.println("=====USING NEGATE PREDICATE======");
		for (Student student : students) {
			if (p3.negate().test(student)) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student Age: " + student.getAge());
			}
		}
		System.out.println("\n");

		System.out.println("=============================");
		System.out.println("=====USING ISEQUAL PREDICATE======");
		for (Student student : students) {
			if (p5.test(student)) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student Age: " + student.getAge());
			}
		}

	}

	class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean equals(Object obj) {
			Student student = (Student) obj;
			if ((this.getName().equals(student.getName()) && this.getAge() == student.getAge())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public List<Student> populateStudentList() {
		List<Student> studentList = Arrays.asList(new Student("Abdul", 31), new Student("Waheed", 29),
				new Student("DummyUser", 20), new Student("Adam", 25));
		return studentList;

	}

}
