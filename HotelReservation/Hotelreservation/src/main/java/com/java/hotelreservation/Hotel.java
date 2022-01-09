package com.java.hotelreservation;

public class Hotel {

	private int rate;
	private String name;
	private String hotelname;
	private int totalrate;
	private int ratings;

	public Hotel() {

	}

	public Hotel(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getTotalrate() {
		return totalrate = rate * 2;
	}

	public void setTotalrate(int totalrate) {
		this.totalrate = totalrate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ",rate=" + rate + " ,totalrate= " + totalrate + "]";
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
