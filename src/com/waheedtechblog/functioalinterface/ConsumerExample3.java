package com.waheedtechblog.functioalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 * Use of Predicate, Function and Consumer Functional Interface in one class;
 * 
 * It will print name of the student who has marks greater than 60% with its
 * GRADE.
 * 
 * @author Abdul Waheed
 *
 */
public class ConsumerExample3 {

	public static void main(String[] args) {

		ConsumerExample3 consumerExample3 = new ConsumerExample3();

		Predicate<Stud> p1 = student -> student.getMarks() > 60;

		Function<Stud, String> f1 = student -> {
			int marks = student.getMarks();

			if (marks > 80) {
				return "A";
			} else if (marks > 70) {
				return "B";
			} else if (marks > 60) {
				return "C";
			} else {
				return "E";
			}
		};

		// Internally invoking Function interface
		Consumer<Stud> c1 = student -> {
			System.out.println("Name: " + student.getName());
			System.out.println("Marks: " + student.getMarks());
			System.out.println("Grade: " + f1.apply(student));
			System.out.println("================================");
		};

		List<Stud> students = consumerExample3.populateStudentList();
		for (Stud stud : students) {
			if (p1.test(stud)) {
				c1.accept(stud);
			}
		}
	}

	public List<Stud> populateStudentList() {
		List<Stud> studentList = Arrays.asList(new Stud("Abdul", 31, 60), new Stud("Waheed", 29, 90),
				new Stud("DummyUser", 20, 80), new Stud("Adam", 25, 47));
		return studentList;
	}
}

class Stud {
	private String name;
	private int age;
	private int marks;

	public Stud(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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
