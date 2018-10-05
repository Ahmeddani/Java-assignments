package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import org.junit.Assert;

public class CarTest {

	private static DecimalFormat df2 = new DecimalFormat(".##");
	Car cartest;
@Before
public void setup() {
	cartest = new Car(false);
}

@Test
public void check_toll_if_car_doesnot_have_trailer() {
	double result = cartest.CalculateToll(70); //Arrange
	Assert.assertEquals(1.40, result, 10);
}

@Test
public void check_toll_if_car_has_trailer() {
	cartest = new Car(true);
	double result = cartest.CalculateToll(70); //Arrange
	Assert.assertEquals(2.40, result, 10); //Assert
}
}
