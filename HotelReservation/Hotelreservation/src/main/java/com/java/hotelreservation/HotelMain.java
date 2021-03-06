package com.java.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HotelMain {

	static Scanner scan = new Scanner(System.in);
	static List<Hotel> hotel = new ArrayList<>();
	
	public static boolean addhotel() {

		System.out.println("Enter the how many hotel you want to add :");
		int val = scan.nextInt();
		for (int i = 0; i < val; i++) {
			System.out.println("Enter the hotel name :");
			String name = scan.next();
			System.out.println("Enter the hotel rating :");
			int rate = scan.nextInt();
			Hotel h1 = new Hotel(name, rate);
			hotel.add(h1);
			System.out.println(hotel.toString());
		}
		return true;
	}
	//uc2
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("ddMMMyyyy");

	public static boolean cheapestHotel(String startDate, String endDate) {
		addhotel();
		LocalDate startDate1 = LocalDate.parse(startDate, DATE_FORMAT);
		LocalDate endDate1 = LocalDate.parse(endDate, DATE_FORMAT);
		long days = ChronoUnit.DAYS.between(startDate1, endDate1);

		List<Hotel> rates = hotel.stream().map(hotelData -> {
			Hotel res = new Hotel();
			res.setName(hotelData.getName());
			res.setTotalrate(hotelData.getRatings());
			return res;
		}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

		System.out.printf("The total days are : %d\n", days);
		rates.forEach(System.out::println);
		return true;

	}
	//uc3
	public static boolean addweekdayweekend() {

		System.out.println("Enter the how many hotel you want to add :");
		int val = scan.nextInt();
		for (int i = 0; i < val; i++) {
			System.out.println("Enter the hotel name :");
			String name = scan.next();
			System.out.println("Enter the weekday rate :");
			int weekday = scan.nextInt();
			System.out.println("Enter the weekend rate :");
			int weekend = scan.nextInt();
			//uc5
			System.out.println("Enter the hotel ratings :");
			int ratings = scan.nextInt();
			Hotel h1 = new Hotel(name, weekday, weekend, ratings);
			hotel.add(h1);
			System.out.println(hotel.toString());
		}
		return true;
	}
	//uc4
	private static final DateTimeFormatter DATE_FORMAT1 = DateTimeFormatter.ofPattern("ddMMMyyyy");

	public static boolean cheapesthotelweekdayweekend(String startDate, String endDate) {
		addweekdayweekend();
		LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT1);
		LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT1);
		int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

		List<Hotel> rates = hotel.stream().map(hotelData -> {
			Hotel res = new Hotel();

			if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
					|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
//				res.setTotalrate(hotelData.getWeekendRate() * days);
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			} else {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			}
			res.setWeekdayRate(hotelData.getWeekdayRate());
			res.setWeekendRate(hotelData.getWeekendRate());
			
			res.setName(hotelData.getName());
			return res;
		}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

		System.out.printf("The total days are : %d\n", days);
		rates.forEach(System.out::println);
		return true;
	}
	//uc5
	private static final DateTimeFormatter DATE_FORMAT5 = DateTimeFormatter.ofPattern("ddMMMyyyy");

	public static boolean addratingseachhotel(String startDate, String endDate) {
		addweekdayweekend();
		LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT5);
		LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT5);
		int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

		List<Hotel> rates = hotel.stream().map(hotelData -> {
			Hotel res = new Hotel();

			if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
					|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			} else {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			}
			res.setWeekdayRate(hotelData.getWeekdayRate());
			res.setWeekendRate(hotelData.getWeekendRate());
			res.setRatings(hotelData.getRatings());
			res.setName(hotelData.getName());
			return res;
		}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

		System.out.printf("The total days are : %d\n", days);
		rates.forEach(System.out::println);
		return true;
	}
	
	private static final DateTimeFormatter DATE_FORMAT2 = DateTimeFormatter.ofPattern("ddMMMyyyy");
	public static boolean cheapesthoteltobest(String startDate, String endDate) {
		addweekdayweekend();
		LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT2);
		LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT2);
		int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

		List<Hotel> rates = hotel.stream().map(hotelData -> {
			Hotel res = new Hotel();

			if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
					|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			} else {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			}
			res.setWeekdayRate(hotelData.getWeekdayRate());
			res.setWeekendRate(hotelData.getWeekendRate());
			res.setRatings(hotelData.getRatings());
			res.setName(hotelData.getName());
			return res;
		}).sorted(Comparator.comparing(Hotel::getRatings).thenComparing(Hotel::getTotalrate)).collect(Collectors.toList());

		System.out.printf("The total days are : %d\n", days);
		rates.forEach(System.out::println);
		return true;
	}
	
	private static final DateTimeFormatter DATE_FORMAT3 = DateTimeFormatter.ofPattern("ddMMMyyyy");
	public static boolean bestratedhotel(String startDate, String endDate) {
		addweekdayweekend();
		LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT3);
		LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT3);
		int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

		List<Hotel> rates = hotel.stream().map(hotelData -> {
			Hotel res = new Hotel();

			if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
					|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			} else {
				res.setTotalrate(hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days);
			}
			res.setWeekdayRate(hotelData.getWeekdayRate());
			res.setWeekendRate(hotelData.getWeekendRate());
			res.setRatings(hotelData.getRatings());
			res.setName(hotelData.getName());
			return res;
		}).sorted(Comparator.comparing(Hotel::getRatings).reversed()).collect(Collectors.toList());

		System.out.printf("The total days are : %d\n", days);
		rates.forEach(System.out::println);
		return true;
	}
	
	public boolean addspecialrates() {

		System.out.println("Enter the how many hotel you want to add :");
		int val = scan.nextInt();
		for (int i = 0; i < val; i++) {
			System.out.println("Enter the hotel name :");
			String name = scan.next();
			System.out.println("Enter the regularweekday rate :");
			int regweekday = scan.nextInt();
			System.out.println("Enter the regularweekend rate :");
			int regweekend = scan.nextInt();
			System.out.println("Enter the rewardweekday rate :");
			int rewardweekday = scan.nextInt();
			System.out.println("Enter the rewardweekend rate :");
			int rewardweekend = scan.nextInt();
			System.out.println("Enter the hotel ratings :");
			int ratings = scan.nextInt();
			Hotel h2 = new Hotel(name,ratings,regweekday,regweekend,rewardweekday,rewardweekend);
			hotel.add(h2);
			System.out.println(hotel.toString());
			
		}
		return true;
	}
	
		private static final DateTimeFormatter DATE_FORMAT4 = DateTimeFormatter.ofPattern("ddMMMyyyy");
		public static boolean findchepestbestrewardcustomers(Customer customertype,String startDate, String endDate) {
			
			LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT4);
			LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT4);
			int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

			List<Hotel> rates = hotel.stream().map(hotelData -> {
				Hotel res = new Hotel();

				if(Customer.REWARD.equals(customertype))
				{
					if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
							|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
						res.setTotalrate(hotelData.getRewardweekendrate() *days);
					} else {
						res.setTotalrate(hotelData.getRewardweekdayrate() * days);
					}
					
				}
				res.setRatings(hotelData.getRatings());
				res.setRegularweekdayrate(hotelData.getRegularweekdayrate());
				res.setRegularweekendrate(hotelData.getRegularweekendrate());
				res.setRewardweekdayrate(hotelData.getRewardweekdayrate());
				res.setRewardweekendrate(hotelData.getRewardweekendrate());
				
				res.setName(hotelData.getName());
				return res;
			}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

			System.out.printf("The total days are : %d\n", days);
			rates.forEach(System.out::println);
			return true;
			
		}
		
		private static final DateTimeFormatter DATE_FORMAT7 = DateTimeFormatter.ofPattern("ddMMMyyyy");
		public static boolean findchepestbestrewardcustomerstream(Customer customertype,String startDate, String endDate) {
			
			LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT7);
			LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT7);
			int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

			List<Hotel> rates = hotel.stream().map(hotelData -> {
				Hotel res = new Hotel();

				if(Customer.REWARD.equals(customertype))
				{
					if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
							|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
						res.setTotalrate(hotelData.getRewardweekendrate() *days);
					} else {
						res.setTotalrate(hotelData.getRewardweekdayrate() * days);
					}
					
				}
				res.setRatings(hotelData.getRatings());
				res.setRegularweekdayrate(hotelData.getRegularweekdayrate());
				res.setRegularweekendrate(hotelData.getRegularweekendrate());
				res.setRewardweekdayrate(hotelData.getRewardweekdayrate());
				res.setRewardweekendrate(hotelData.getRewardweekendrate());
				
				res.setName(hotelData.getName());
				return res;
			}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

			System.out.printf("The total days are : %d\n", days);
			rates.forEach(System.out::println);
			return true;
			
		}
		
		private static final DateTimeFormatter DATE_FORMAT6 = DateTimeFormatter.ofPattern("ddMMMyyyy");
		public static boolean findchepestbestrewardcustomersexception(Customer customertype,String startDate, String endDate) throws InvalidUserInputException {
			
			if (customertype!=null) {
				LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT6);
				LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT6);
				int days = (int) ChronoUnit.DAYS.between(startDate2, endDate2);

				List<Hotel> rates = hotel.stream().map(hotelData -> {
					Hotel res = new Hotel();

					if (Customer.REWARD.equals(customertype)) {
						if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
								|| endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
							res.setTotalrate(hotelData.getRewardweekendrate() * days);
						} else {
							res.setTotalrate(hotelData.getRewardweekdayrate() * days);
						}

					}
					res.setRatings(hotelData.getRatings());
					res.setRegularweekdayrate(hotelData.getRegularweekdayrate());
					res.setRegularweekendrate(hotelData.getRegularweekendrate());
					res.setRewardweekdayrate(hotelData.getRewardweekdayrate());
					res.setRewardweekendrate(hotelData.getRewardweekendrate());

					res.setName(hotelData.getName());
					return res;
				}).sorted(Comparator.comparing(Hotel::getTotalrate)).collect(Collectors.toList());

				System.out.printf("The total days are : %d\n", days);
				rates.forEach(System.out::println);
				return true;
			}
			throw new InvalidUserInputException();
			
		}
		
		public static void main(String args[]) {

			HotelMain obj = new HotelMain();
			obj.addspecialrates();
		}
}
