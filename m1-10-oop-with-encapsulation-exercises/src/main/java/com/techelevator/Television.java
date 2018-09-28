package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public Television() {
		this.isOn = false;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public void turnOn() {
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	public void changeChannel(int newChannel) {
		if ((isOn) && (newChannel >= 3 && newChannel<= 18)) {
			this.currentChannel = newChannel;
		}
		else {
			this.currentChannel = 3;
		}
	}
	
	public void channelUp() {
		if(isOn) {
			this.currentChannel += 1;
			if (this.currentChannel > 18) {
				this.currentChannel = 3;
			}
		}
	}
	
	public void channelDown() {
		if (isOn) {
			this.currentChannel -= 1;
			if(this.currentChannel < 3) {
				this.currentChannel = 18;
			}
		}
	}
	
	public void raiseVolume() {
		if (isOn) {
			if (this.currentVolume == 10) {
			this.currentVolume = 10;
		}
			else {
			this.currentVolume += 1;
			}
		}
	}
	
	public void lowerVolume() {
		if (isOn) {
			if (this.currentVolume == 0) {
				this.currentVolume = 0;
			}
			else {
			this.currentVolume -= 1;
			}
		}
	}
}
