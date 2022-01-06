package com.java.regex.Hotelreservation;

public class Hotel {

	private String rating;
	private String name;

	public Hotel(String name, String rating) {
		this.name = name;
		this.rating = rating;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hotel [rating=" + rating + ", name=" + name + "]";
	}

}
