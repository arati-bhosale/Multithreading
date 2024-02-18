package com.multithreding.example;

public class YieldMethod extends Thread {

	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(" Thread : "+ " Value of i = " +i + " " + Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		
		YieldMethod  y = new YieldMethod();
		y.start();
		
		Thread.yield();
		for(int i=1; i<=5; i++) {
			System.out.println(" Main : "+ " Value of i " +i + " " + Thread.currentThread().getName());
		}
	}
}
