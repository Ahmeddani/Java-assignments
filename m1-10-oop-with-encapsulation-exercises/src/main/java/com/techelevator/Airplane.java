package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return this.totalFirstClassSeats - this.bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		return this.totalCoachSeats - this.bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
		if (forFirstClass) {
			if (getAvailableFirstClassSeats() != 0 && getAvailableFirstClassSeats() >= totalNumberOfSeats) {
			this.bookedFirstClassSeats += totalNumberOfSeats;
			return true;
			}
			return false;
		}
		else if (getAvailableCoachSeats() != 0 && getAvailableCoachSeats() >= totalNumberOfSeats) {
			
			this.bookedCoachSeats += totalNumberOfSeats;
			return true;
		}
		return false;
	}
}
