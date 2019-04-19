package com.waheedtechblog.functioalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainning {

	public static void main(String[] args) {

		ConsumerChainning chainning = new ConsumerChainning();

		Consumer<Student> addToDB = Student -> {
			System.out.println("Open Database Connection");
			System.out.println("Write Record to DB");
			System.out.println("Name: " + Student.getName() + ", Age: " + Student.getAge());
			System.out.println("Close Connection");
			System.out.println("================================");
		};

		Consumer<Student> sendMail = Student -> {
			System.out.println("Configure Mail Server");
			System.out.println("Send Mail to user " + Student.getName());
			System.out.println("================================\n");
		};

		List<Student> students = chainning.populateStudentList();
		for (Student student : students) {
			addToDB.andThen(sendMail).accept(student);
		}
	}

	public List<Student> populateStudentList() {
		List<Student> studentList = Arrays.asList(new Student("Abdul", 31), new Student("Waheed", 29),
				new Student("DummyUser", 20), new Student("Adam", 25));
		return studentList;
	}

}
