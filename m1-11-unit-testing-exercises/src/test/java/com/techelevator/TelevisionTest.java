package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	Television television = new Television();
	
	@Test
	public void check_upper_bound_volume_limit() {
		television.TurnOn();
		television.RaiseVolume();
		Assert.assertEquals(3 , television.getCurrentVolume());
	}
	
	@Test
	public void check_lower_bound_volume_limit() {
		television.TurnOn();
		television.LowerVolume();
		Assert.assertEquals(1 , television.getCurrentVolume());
	}
	
	@Test
	public void volume_reset_when_on() {
		television.TurnOn();
		Assert.assertEquals(2, television.getCurrentVolume());
		Assert.assertEquals(true, television.IsOn());
	}
	
	@Test
	public void incorrect_channel_change() {
		television.TurnOn();
		television.ChangeChannel(19);
		Assert.assertEquals(3 , television.getSelectedChannel());
		television.TurnOn();
		television.ChangeChannel(1);
		Assert.assertEquals(3 , television.getSelectedChannel());
	}
	
	@Test
	public void check_tv_when_turn_off() {
		television.TurnOff();
		Assert.assertEquals(false , television.IsOn());
	}
	
	@Test
	public void check_tv_when_turn_on() {
		television.TurnOn();
		Assert.assertEquals(true , television.IsOn());
		Assert.assertEquals(2 , television.getCurrentVolume());
	}
    
	@Test
	public void correct_channel_change() {
		television.TurnOn();
		television.ChangeChannel(8);
		Assert.assertEquals(8, television.getSelectedChannel());
		Assert.assertEquals(true , television.IsOn());
	}
}
