package com.multithreding.example;
//main thread stop and other thread execute and join the main thread
public class JoinMethod extends Thread{

	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			try {
				System.out.println(" Created Thread : "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}}}
		
	public static void main(String[] args) {
		
		JoinMethod jm = new JoinMethod();
		jm.start();
		
		for(int i=1; i<=5; i++) {
			
			try {
				System.out.println(" Main Thread : " + i);
				jm.join();	
				jm.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
}}		}
		
	

