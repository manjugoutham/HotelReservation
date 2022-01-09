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
			Hotel h1 = new Hotel(name, weekday, weekend);
			hotel.add(h1);
			System.out.println(hotel.toString());
		}
		return true;
	}
	
	public static void main(String args[]) {

		HotelMain obj = new HotelMain();
		obj.addweekdayweekend();
	}

}
