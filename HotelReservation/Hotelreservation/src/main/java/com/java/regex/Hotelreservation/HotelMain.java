package com.java.regex.Hotelreservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelMain {

	Scanner scan = new Scanner(System.in);
	List<Hotel> hotel = new ArrayList<>();

	public void addhotel() {
		
		System.out.println("Enter the how many hotel you want to add :");
		int val = scan.nextInt();
		for(int i =0;i<val;i++)
		{
		System.out.println("Enter the hotel name :");
		String name = scan.next();
		System.out.println("Enter the hotel rating :");
		String rating = scan.next();
		Hotel h1 = new Hotel(name, rating);
		hotel.add(h1);
		System.out.println(hotel.toString());
		}
	}

	public static void main(String args[]) {
		
		HotelMain obj = new HotelMain();
		obj.addhotel();

	}

}
