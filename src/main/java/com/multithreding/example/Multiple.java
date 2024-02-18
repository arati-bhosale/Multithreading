package com.multithreding.example;
//multiple task multiple thread

class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("MyThread1...");
	}
}
class MyThread2 extends Thread{
	
	public void run() {
		System.out.println("MyThread2....");
	}
}


public class Multiple  {
	
	public static void main(String[] args) {
		
		MyThread1 m1 = new MyThread1();
		m1.start();
		
		MyThread2 m2 = new MyThread2();
		m2.start();
	}	
}
