package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class SmartPhoneTest {

	SmartPhone smartPhone = new SmartPhone("736648854", "T-Mobile");
	@Test
	public void battery_after_recharging() {
		smartPhone.RechargeBattery();
		Assert.assertEquals("battery not fully charged", 100, smartPhone.getBatteryCharge());
		
	}
	
	@Test
	public void check_when_phone_hangeup() {
		smartPhone.HangUp();
		Assert.assertEquals(false, smartPhone.isOnCall());
	}
	
	@Test
	public void check_answer_phone() {
		smartPhone.AnswerPhone();
		Assert.assertEquals(true, smartPhone.isOnCall());
	}
	
	@Test
	public void check_for_insufficient_battery_charge() {
		smartPhone.Call("7464747477", 120);
		Assert.assertEquals("Cannot make the dial" , 100 , smartPhone.getBatteryCharge());
	}
	
	@Test
	public void incorrect_phone_number() {
		Assert.assertEquals(false , smartPhone.Call("2726525", 10));
	}
	
	@Test
	public void battery_charge_after_talking() {
		smartPhone.Call("5789765567", 50);
		Assert.assertEquals(50, smartPhone.getBatteryCharge());
	}
}
