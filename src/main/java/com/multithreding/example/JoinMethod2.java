package com.multithreding.example;
//created thread stop and main thread execute and join the created thread
public class JoinMethod2 extends Thread {

	static Thread mainThread ;
	public void run() {
		
            for(int i=1; i<=5; i++) {
            		
			try {
				mainThread.join();
				System.out.println(" Create Thread : "+i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    }}	
	public static void main(String[] args) {
		
	    mainThread = Thread.currentThread(); //main Thread reference created 
		
		JoinMethod2 jm = new JoinMethod2();
		jm.start();
		
		for(int i=1; i<=5; i++) {
			
			try {
				System.out.println(" Main Thread : "+i);
				//mainThread.join();
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		JoinMethod2 jm = new JoinMethod2();
//		jm.start();
	}	
	}
	

