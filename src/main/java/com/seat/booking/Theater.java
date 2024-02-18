package com.seat.booking;

public class Theater {

	int totalSeats = 10;
	
	public synchronized void seatBooking(int seats) {
		
		if(totalSeats >= seats) {
			System.out.println(Thread.currentThread().getName()+" "+seats+" "+" seats are booked successfully!!!");
			totalSeats = totalSeats-seats;
		}
		else {
			System.out.println(Thread.currentThread().getName()+" "+seats+" "+" seats are not available!!!");
			System.out.println(totalSeats+" are available only!!!!");		
		}
	}
}
