package com.staticblock;

public class MyThread1 extends Thread {

	Table table;

	public MyThread1(Table table) {
		super();
		this.table = table;
	}
	
	public void run() {
		table.printTable();
	}
	
}
