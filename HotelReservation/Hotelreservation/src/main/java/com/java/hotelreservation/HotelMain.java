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
	//uc1
	public static boolean addhotel() {

		System.out.println("Enter the how many hotel you want to add :");
		int val = scan.nextInt();
		for (int i = 0; i < val; i++) {
			System.out.println("Enter the hotel name :");
			String name = scan.next();
			System.out.println("Enter the hotel rate :");
			int rate = scan.nextInt();
			Hotel h1 = new Hotel(name, rate);
			hotel.add(h1);
			System.out.println(hotel.toString());
		}
		return true;
	}
	
	
	public static void main(String args[]) {

		HotelMain obj = new HotelMain();
		obj.addhotel();
	}

}
