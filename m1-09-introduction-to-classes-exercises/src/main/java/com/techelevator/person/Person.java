package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
    public String getLastName() {
		
		return this.lastName;
	}
    
    public int getAge() {
    	
    	return this.age;
    }
	
   public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
   
   public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
   
   public void setAge(int age) {
		
		this.age = age;
		
   }
	public String getFullName() {
		
		return this.lastName + ", " + this.firstName;
	}
	
   
	
   
   
	public boolean isAdult() {
		
		if(this.age >= 18) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
}
