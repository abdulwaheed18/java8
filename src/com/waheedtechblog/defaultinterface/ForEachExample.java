package com.waheedtechblog.defaultinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class will demonstrate the iteration way before and after java8.
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		
		Map<String, Integer> beforeJava8Map = new HashMap<>();
		beforeJava8Map.put("A", 1);
		beforeJava8Map.put("B", 2);
		beforeJava8Map.put("C", 3);

		// before java8
		for (Map.Entry<String, Integer> entry : beforeJava8Map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		// After java8
		beforeJava8Map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

		List<String> beforeJava8List = new ArrayList<>();
		beforeJava8List.add("A");
		beforeJava8List.add("B");
		beforeJava8List.add("C");

		// before java8
		for (String list : beforeJava8List) {
			System.out.println(list);
		}

		// After java 8
		beforeJava8List.forEach(list -> System.out.println(list));

	}

}
