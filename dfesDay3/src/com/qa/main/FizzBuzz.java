package com.qa.main;

public class FizzBuzz {

	public static void fuzzy(int num) {
//		Create a method which returns 'Fizz' for multiples of three and 
//		'Buzz' for the multiples of five.
//		Return 'FizzBuzz' for numbers which are multiples of both three and five.
//		Return the input number for numbers that are neither.
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
	
		} else if (num % 5 == 0) {
	
			System.out.println("Buzz");
	
		} else if (num % 3 == 0) {
	
			System.out.println("Fizz");
	
		} else {
			
			System.out.println(num);;
		}
	
	}

}
