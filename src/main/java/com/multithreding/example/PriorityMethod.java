package com.multithreding.example;

public class PriorityMethod extends Thread {

	public void run() {
//		System.out.println("Run Method ");
		System.out.println("Run Method Priority " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("Run Method Priority... " + Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method old Priority " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println("Main Method new Priority " + Thread.currentThread().getPriority());
		
//		System.out.println("Main Method");
		
		PriorityMethod pm = new PriorityMethod();
		pm.start();
		System.out.println("Main Method old Priority " + Thread.currentThread().getPriority());
//		pm.setPriority(11);           // IllegalArgumentException
	}
}
