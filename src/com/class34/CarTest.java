package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {
	public static void main(String[] args) {
		// Car car1 = new Car("Toyota", "Corolla");
		Car car2 = new Car("lada", "priora");
		Car car3 = new Car("jeep", "cherokee");
//		car1.details();
//		car2.details();
//		car3.details();

		Map<Integer, Car> carMap = new HashMap<>();
		carMap.put(1, new Car("BMW", "X8"));
		carMap.put(2, car2);

		carMap.put(3, car3);
		Collection<Car> carValue = carMap.values();

		for (Car car : carValue) {
			car.details();

		}

	}

}
