package com.techelevator.validation.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {

@NotBlank(message = "first Name is required")
@Size(max = 20)
private String firstName;

@NotBlank(message = "last Name is required")
@Size(max = 20)
private String lastName;

@NotBlank(message = "Email address is required")
@Email(message = "Email must be a valid email address")
private String email;

@NotBlank(message = "Email address is required")
@Email(message = "Email must be a valid email address")
private String confirmEmail;

@NotBlank(message = "password is required")
@Min(value = 8, message = "minimum characters should be 8")
private String password;

@NotBlank(message = "passwor must match")
private String confirmPassword;

@NotBlank(message = "Birth Date is required")
@DateTimeFormat(pattern = "mm/dd/yyyy")
private LocalDate birthDate;

@NotBlank(message = "number of tickets is required")
@Range(min = 1, max = 10, message = "number of ticket is out of range")
private String numberOfTickets;

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getConfirmEmail() {
	return confirmEmail;
}
public void setConfirmEmail(String confirmEmail) {
	this.confirmEmail = confirmEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}
public String getNumberOfTickets() {
	return numberOfTickets;
}
public void setNumberOfTickets(String numberOfTickets) {
	this.numberOfTickets = numberOfTickets;
}
private boolean emailMatching;
@AssertTrue(message="Emails must match")
public boolean isEmailMatching() {
	if(email != null) {
		return email.equals(confirmEmail);
	} else {
		return false;
	}
}


private boolean passwordMatching; 
@AssertTrue(message="Passwords must match")
public boolean isPasswordMatching() {
	if(password != null) {
		return password.equals(confirmPassword);
	} else {
		return false;
	}
}

}
