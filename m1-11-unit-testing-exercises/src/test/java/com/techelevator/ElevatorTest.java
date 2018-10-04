package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {

	Elevator elevator;
	
	@Before
	public void setup() {
		elevator = new Elevator(1, 10);
	}
	
	@Test
	public void verify_cannot_move_up_when_door_is_open() {
		// Arrange
		elevator.OpenDoor();
		// Act
		boolean didMove = elevator.GoUp(3);
		// Assert
		Assert.assertFalse("GoUp returned TRUE", didMove);
		Assert.assertEquals("Elevator moved", 1, elevator.getCurrentLevel());
		
	}
	
	@Test
	public void verify_cannot_move_down_when_door_is_open() {
		// Arrange
		elevator.CloseDoor();
		elevator.GoUp(5);
		elevator.OpenDoor();
		// Act
		boolean didMove = elevator.GoDown(3);
		// Assert
		Assert.assertFalse("GoDown returned TRUE", didMove);
		Assert.assertEquals("Elevator moved", 5, elevator.getCurrentLevel());
		
	}
	
	@Test
	public void is_door_open() {
		boolean isMoving = elevator.isMoving();
		elevator.OpenDoor();
		Assert.assertEquals( false ,  isMoving);
		Assert.assertEquals( true ,  elevator.isDoorOpen());
	}
	
	@Test
	public void verify_cannot_move_up_past_ceiling() {
		elevator.CloseDoor();
		boolean didMove = elevator.GoUp(15);
		Assert.assertEquals("Elevator did not move", 1, elevator.getCurrentLevel());
		Assert.assertEquals(false, didMove);
	}
	
	@Test
	public void verify_cannot_move_down_past_1st_floor() {
		elevator.CloseDoor();
		boolean didMove = elevator.GoDown(0);
		Assert.assertEquals("Elevator did not move", 1, elevator.getCurrentLevel());
		Assert.assertEquals(false, didMove);
	}
	
	@Test
	public void verify_can_move_down_to_1stfloor() {
		elevator.CloseDoor();
		elevator.GoUp(7);
		elevator.CloseDoor();
		boolean didMove = elevator.GoDown(1);
		Assert.assertEquals("Elevator moved", 1, elevator.getCurrentLevel());
		Assert.assertEquals(true, didMove);
	}
	
}
