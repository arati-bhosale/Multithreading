package com.multithreding.example;

//single task multiple thread

public class Single extends Thread{
	
	public void run() {
		System.out.println("single task multiple thread ");
	}

	public static void main(String[] args) {
		
		Single s1 = new Single();
		s1.start();
		
		Single s2 = new Single();
		s2.start();
	}
}
