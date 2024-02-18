package com.seat.booking;

public class TestSeatBooking {

	public static void main(String[] args) {
       
		Theater theater = new Theater();
		
		ThreadOne t1 = new ThreadOne(theater,5);
		t1.setName("Aarati");
		t1.start();
		
		ThreadTwo t2 = new ThreadTwo(theater,7);
		t2.setName("Sayali");
		t2.start();	
	}
}
