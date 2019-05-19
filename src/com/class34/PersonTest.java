package com.class34;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {
		Map<Integer, Person> personMap = new HashMap<>();

		personMap.put(1, new Person("Ali", "Nazarov", 25, 90000));
		personMap.put(2, new Person("Denis", "Ivancioglu", 22, 110000));
		personMap.put(3, new Person("Michael", "Jackson", 100, 60000));

		Collection<Person> set = personMap.values();
		for (Person key : set) {
			key.details();
		}
		Iterator<Person> it = personMap.values().iterator();
		while (it.hasNext()) {
			it.next().details();

		}

	}

}
