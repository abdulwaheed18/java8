package com.waheedtechblog.functioalinterface;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		// Calling Consumer Functional Interface without using Lambda Expression
		SendNotification notification = new SendNotification();
		notification.accept("Abdul");

		// Using Lambda Expression
		Consumer<String> consumer = username -> System.out.println("Send mail notification to : " + username);
		consumer.accept("Waheed");
	}
}

class SendNotification implements Consumer<String> {

	@Override
	public void accept(String user) {
		System.out.println("Send mail notification to : " + user);
	}
}
