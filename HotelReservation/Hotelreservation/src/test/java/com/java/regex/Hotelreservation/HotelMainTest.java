package com.java.regex.Hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void cheapestHotelTest() {
		HotelMain obj = new HotelMain();
		boolean result = obj.cheapestHotel("10Jun2021", "12Jun2021");
		Assert.assertEquals(true, result);
	}

}
