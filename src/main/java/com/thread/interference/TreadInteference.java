package com.thread.interference;

public class TreadInteference {

	public void print() {
		System.out.println(Thread.currentThread().getName() + " Hi ");
	}
	
	public static void main(String[] args) {
		
		TreadInteference inteference = new TreadInteference();
		
		MyThread1 myThread1 = new MyThread1(inteference);
		MyThread2 myThread2 = new MyThread2(inteference);
		
//		Thread t1 = new Thread(inteference);
//		Thread t2 = new Thread(inteference);
		
	}
}
