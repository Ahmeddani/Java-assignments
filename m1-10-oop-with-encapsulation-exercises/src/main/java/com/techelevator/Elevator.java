package com.techelevator;

public class Elevator {

	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOffloors) {
		this.numberOfFloors = totalNumberOffloors;
		this.currentFloor = 1;
		}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	public void openDoor() {
		this.doorOpen = true;
	}
	
	public void closeDoor() {
	     this.doorOpen = false;	
	}
	
	public void goUp(int desiredFloor) {
		if(!doorOpen) {
			if(currentFloor != numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
		}	
	}
	
	public void goDown(int desiredFloor) {
		if(!doorOpen) {
			if(currentFloor != 1) {
			this.currentFloor = desiredFloor;
			}
		}
	}
}
