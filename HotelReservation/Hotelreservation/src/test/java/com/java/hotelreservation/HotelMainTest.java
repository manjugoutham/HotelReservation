package com.java.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import com.java.hotelreservation.Customer;
import com.java.hotelreservation.HotelMain;

public class HotelMainTest {

	@Test
	public void findchepestbestrewardcustomersexceptionTest() {
		HotelMain obj = new HotelMain();
		obj.addspecialrates();
		boolean result;
		try {
			result = obj.findchepestbestrewardcustomersexception(null, "10Jun2021", "12Jun2021");
			Assert.assertEquals(true, result);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block
			System.err.println("Invalid input");
			// e.printStackTrace();
		}
	}

}
