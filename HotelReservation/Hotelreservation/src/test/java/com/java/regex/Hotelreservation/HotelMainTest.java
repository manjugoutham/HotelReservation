package com.java.regex.Hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void addweekdayweekendTest() {
		HotelMain obj = new HotelMain();
		obj.addweekdayweekend();
		boolean result = obj.addweekdayweekend();
		Assert.assertEquals(true, result);
	}

}
