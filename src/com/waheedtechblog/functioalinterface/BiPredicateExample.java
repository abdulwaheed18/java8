package com.waheedtechblog.functioalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicateExample predicate = new BiPredicateExample();

		BiPredicate<Integer, String> b1 = (age, name) -> age > 30 && name.startsWith("A");

		List<Student> students = predicate.populateStudentList();
		for (Student student : students) {
			if (b1.test(student.getAge(), student.getName())) {
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
