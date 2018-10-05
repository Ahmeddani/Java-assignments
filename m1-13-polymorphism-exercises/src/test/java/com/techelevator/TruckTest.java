package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruckTest {

	Truck truck;
@Before
public void setup() {
	truck = new Truck(4);
}

@Test
public void toll_if_axle_is_4() {
	double resutlt = truck.CalculateToll(10);
	Assert.assertEquals(0.40, resutlt, 10);
}

@Test
public void toll_if_axle_is_6() {
	truck = new Truck(6);
	double resutlt = truck.CalculateToll(10);
	Assert.assertEquals(0.45, resutlt, 1);
}

@Test
public void toll_if_axle_is_8_plus() {
	truck = new Truck(9);
	double resutlt = truck.CalculateToll(10);
	Assert.assertEquals(0.48, resutlt, 10);
}
}
