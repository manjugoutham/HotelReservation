package com.java.hotelreservation;

import java.time.LocalDate;

public class Hotel {

	private int rate;
	private String name;

	public Hotel() {

	}

	public Hotel(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ",rate=" + rate + "]";
	}

}
