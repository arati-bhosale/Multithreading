package com.multithreding.example;

public class SleepDemo extends Thread {
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println( i +" " + Thread.currentThread().getName());
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
//		SleepDemo sd = new SleepDemo();
//		sd.start();
//		sd.run();
		
		SleepDemo sd1 = new SleepDemo();
		sd1.start();
		sd1.run();
	}
}
