package com.java.hotelreservation;

public class Hotel {

	private int rate;
	private String name;
	private String hotelname;
	private int totalrate;
	private int weekendRate;
	private int weekdayRate;
	private int ratings;

	public Hotel() {

	}
	public Hotel(String name, int weekendRate, int weekdayRate, int ratings) {
		super();
		this.name = name;
		this.weekendRate = weekendRate;
		this.weekdayRate = weekdayRate;
		this.ratings = ratings;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getTotalrate() {
		return totalrate;
	}

	public void setTotalrate(int totalrate) {
		this.totalrate = totalrate;
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

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	public int getWeekdayRate() {
		return weekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ",rate=" + rate + ", totalrate=" + totalrate
				+ ", weekendRate=" + weekendRate + ", weekdayRate=" + weekdayRate + ", ratings=" + ratings + "]";
	}

}
