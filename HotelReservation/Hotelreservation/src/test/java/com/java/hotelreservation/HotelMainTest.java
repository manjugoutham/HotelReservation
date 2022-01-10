package com.java.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void findchepestbestrewardcustomersTest() {
		HotelMain obj = new HotelMain();
		obj.addspecialrates();
		boolean result = obj.findchepestbestrewardcustomers(Customer.REWARD, "10Jun2021", "12Jun2021");
		Assert.assertEquals(true, result);
	}

}
