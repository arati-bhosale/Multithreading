package com.multithreding.example;

public class Testt implements Runnable{

	public void run() {
		
		System.out.println("Thread task");
	}

    public static void main(String[] args) {
    	
    	Testt t =new Testt();
    	Thread th = new Thread(t);
    	th.start();
		
	}
	
}
