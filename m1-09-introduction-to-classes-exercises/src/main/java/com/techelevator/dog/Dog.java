package com.techelevator.dog;

public class Dog {

private boolean sleeping = false;

public boolean isSleeping() {
	return sleeping;
}

public boolean getSleeping() {
	
	return this.sleeping;
}

public String makeSound() {
	
	if(sleeping == true) {
		return "Zzzzz...";
	}
	
	return "Woof!";
}

public void sleep() {
	
	this.sleeping = true;
}

public void wakeUp() {
	
	this.sleeping = false;
}
}
