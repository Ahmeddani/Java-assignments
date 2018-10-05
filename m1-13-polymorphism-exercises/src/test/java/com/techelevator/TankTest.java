package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {

	Tank tank = new Tank();

	@Test
	public void check_for_toll() {

		double result = tank.CalculateToll(30);
		Assert.assertEquals(0.0, result, 1);
	}
}
