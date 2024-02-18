package com.multithreding.example;

//single task single thread  

public class Test extends Thread {
	
	public void run() {
		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println("thread task");
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println(Thread.currentThread().isAlive());
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.start();
//		t.start();          //exception
		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println(t.isAlive());
		System.out.println(t.isAlive());
		Thread.currentThread().setName("Arati");
		
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
//		int r = 10/0;
	}
}
