package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		int totalDistanceTravelled = 0;
		double totalToll = 0.0;
		
		List<Vehicle> cars = new ArrayList<Vehicle>();
		cars.add(new Car(false));
		cars.add(new Truck(4));
		cars.add(new Tank());
		
		System.out.println("----------------------------------------");
		System.out.println("Vehicle    Distance Travelled   Toll $");
		System.out.println("----------------------------------------");
		
		for (Vehicle car : cars) {
			int distance = rand.nextInt((230) + 10);
			totalDistanceTravelled += distance;
			totalToll += car.CalculateToll(distance);
			System.out.printf(car.getClass().getSimpleName() + "\t\t" + distance + "\t\t" + "%.2f", car.CalculateToll(distance));
			System.out.println();
			}
		
		System.out.println("----------------------------------------");
		System.out.println("TOTAL" + "\t\t" + totalDistanceTravelled + "\t\t" + totalToll);

	}

}
