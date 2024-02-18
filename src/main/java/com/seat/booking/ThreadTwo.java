package com.seat.booking;

public class ThreadTwo extends Thread {

	Theater theater;
	int seats;
	
	public ThreadTwo(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	public void run() {
		theater.seatBooking(seats);
	}
	
}
