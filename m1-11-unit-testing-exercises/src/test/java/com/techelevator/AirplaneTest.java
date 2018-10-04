package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	Airplane airplane;
	
	@Before
	public void setup() {
		
		airplane = new Airplane(10,10);
	}
	
	@Test
	public void correct_booking() {
		boolean success = airplane.Reserve(true, 5);
		Assert.assertTrue("Was not able to book ", success);
		Assert.assertEquals("available seat remaining after booking was incorrect " + 
		airplane.getAvailableFirstClassSeats(), 5, airplane.getAvailableFirstClassSeats());
		Assert.assertEquals("number of booked seats was incorrect " + 
		airplane.getBookedFirstClassSeats(), 5, airplane.getBookedFirstClassSeats());
	}
	
	@Test
	public void check_for_overbook_first_class_seats() {
		boolean success = airplane.Reserve(true, 11);
		Assert.assertFalse("Was able to book more than available seats", success);
		Assert.assertEquals(10, airplane.getAvailableFirstClassSeats());
		Assert.assertEquals(0, airplane.getBookedFirstClassSeats());
	}
	@Test
	public void check_for_overbook_coach_class_seats() {
		boolean success = airplane.Reserve(false, 11);
		Assert.assertFalse("Was able to book more than available seats", success);
		Assert.assertEquals(10, airplane.getAvailableCoachSeats());
		Assert.assertEquals(0, airplane.getBookedCoachSeats());
}
	@Test
	public void check_for_available_first_class_seats() {
		boolean success = airplane.Reserve(true, 3);
		Assert.assertEquals(7, airplane.getAvailableFirstClassSeats());
	}
	
	@Test
	public void check_for_available_coach_class_seats() {
		boolean success = airplane.Reserve(false, 5);
		Assert.assertEquals(5, airplane.getAvailableCoachSeats());
	}
	@After
	public void clean() {
		airplane = null;
	}
}