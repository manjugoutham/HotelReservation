

package com.java.hotelreservation;
public class Hotel {

	private int rate;
	private String name;
	private String hotelname;
	private int totalrate;
	private int weekendRate;
	private int weekdayRate;
	private int ratings;
	private int regularweekdayrate;
	private int regularweekendrate;
	private int rewardweekdayrate;
	private int rewardweekendrate;
	private String customertype;

	public Hotel() {

	}

//
//
	public Hotel(String name, int weekendRate, int weekdayRate, int ratings) {
		super();
		this.name = name;
		this.weekendRate = weekendRate;
		this.weekdayRate = weekdayRate;
		this.ratings = ratings;
	}

	public Hotel(String name, int ratings, int regularweekdayrate, int regularweekendrate, int rewardweekdayrate,
			int rewardweekendrate) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.regularweekdayrate = regularweekdayrate;
		this.regularweekendrate = regularweekendrate;
		this.rewardweekdayrate = rewardweekdayrate;
		this.rewardweekendrate = rewardweekendrate;
		this.customertype = customertype;
	}

	public int getRegularweekdayrate() {
		return regularweekdayrate;
	}

	public void setRegularweekdayrate(int regularweekdayrate) {
		this.regularweekdayrate = regularweekdayrate;
	}

	public int getRegularweekendrate() {
		return regularweekendrate;
	}

	public void setRegularweekendrate(int regularweekendrate) {
		this.regularweekendrate = regularweekendrate;
	}

	public int getRewardweekdayrate() {
		return rewardweekdayrate;
	}

	public void setRewardweekdayrate(int rewardweekdayrate) {
		this.rewardweekdayrate = rewardweekdayrate;
	}

	public int getRewardweekendrate() {
		return rewardweekendrate;
	}

	public void setRewardweekendrate(int rewardweekendrate) {
		this.rewardweekendrate = rewardweekendrate;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
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

	// uc 3 to uc7
//	@Override
//	public String toString() {
//		return "Hotel [name=" + name + ",rate=" + rate + ", totalrate=" + totalrate
//				+ ", weekendRate=" + weekendRate + ", weekdayRate=" + weekdayRate + ", ratings=" + ratings + "]";
//	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", totalrate=" + totalrate + ",ratings=" + ratings + ", regularweekdayrate="
				+ regularweekdayrate + ", regularweekendrate=" + regularweekendrate + ", rewardweekdayrate="
				+ rewardweekdayrate + ", rewardweekendrate=" + rewardweekendrate + "]";
	}

}
