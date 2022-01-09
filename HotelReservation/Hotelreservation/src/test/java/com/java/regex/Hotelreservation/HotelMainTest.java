package com.java.regex.Hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void addhotelTest() {
		HotelMain ht = new HotelMain();
		boolean result = ht.addhotel();
		Assert.assertEquals(true, result);

	}

}
