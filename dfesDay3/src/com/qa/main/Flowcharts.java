package com.qa.main;

public class Flowcharts {

	public static void flowA() {
		 
		for(int A = 100; A <= 200; A++) {
			
			System.out.println(A);	
		}
	}
	
	public static void flowA2() {
		 
		for(int A = 100; A <= 200; A++) {
			
			if(A % 2 == 0) {
				System.out.println("-" + A);	
			} else {
				System.out.println("*" + A);
			}
		}
	}
}
