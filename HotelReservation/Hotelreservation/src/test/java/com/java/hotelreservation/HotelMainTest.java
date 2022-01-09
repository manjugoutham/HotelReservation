package com.java.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void addspecialratesTest() {
		HotelMain obj = new HotelMain();
		boolean result = obj.addspecialrates();
		Assert.assertEquals(true, result);
	}
}
