package com.qa.main;

public class Task_2 {

	public static void moneyLoop() {
		//Task - Create a new class and method that do the following:
		//Using a while loop start with a beginning total (300), subtract an 
		//amount of money from it (45) until the total goes less than another value (87)
		//When the total goes below the set value, print out "You're spending too much 
		//money!"
		int total = 300;
		
		while(total > 87) {
			System.out.println("Your current total is: " + total);
			total -= 45;	
				
		if(total < 87) {
			System.out.println("You're spending too much money!");
			}			
		}
	}

}
