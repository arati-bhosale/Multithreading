package com.multithreding.example;

public class DemonMethod extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon Thread");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		DemonMethod dm = new DemonMethod();
	    System.out.println(".... " +dm.isDaemon());
		dm.setDaemon(true);
		dm.start();
		
	}
}
