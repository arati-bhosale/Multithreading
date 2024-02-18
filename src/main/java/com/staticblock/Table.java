package com.staticblock;

public class Table {

	public void printTable() {
		
		synchronized (this) {
			
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}	
		}
	}
}
