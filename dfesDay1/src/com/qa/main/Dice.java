package com.qa.main;

import java.util.Random;

public class Dice {
	
	public static int threeSidedDie() {
		
		int result = new Random().nextInt(4);
		return result;
	}
	
	public static int fourSidedDie() {
		
		int result = new Random().nextInt(4);
		return result;
	}

	public static int sixSidedDie() {
	
	int result = new Random().nextInt(7);
	return result;
	}

	public static int eightSidedDie() {
	
	int result = new Random().nextInt(9);
	return result;
	}

	public static int tenSidedDie() {
	
	int result = new Random().nextInt(11);
	return result;
	}
	
//	methods that do the following calculations
//	- sum of 4 six sided dice
//	- sum of 2 10 sided dice and 2 3 sided dice
//	- sum of 1 of each dice
	
	public static int addFour_SixSidedDice() {
		
		int roll_1 = sixSidedDie();
		int roll_2 = sixSidedDie();
		int roll_3 = sixSidedDie();
		int roll_4 = sixSidedDie();
		
		System.out.println(roll_1);
		System.out.println(roll_2);
		System.out.println(roll_3);
		System.out.println(roll_4);
		
		int result = roll_1 + roll_2 + roll_3 + roll_4;
		return result;
		
	}
	
	public static int addTwo_TenSided_ThreeSided() {
		
		int roll_1 = tenSidedDie();
		int roll_2 = tenSidedDie();
		int roll_3 = threeSidedDie();
		int roll_4 = threeSidedDie();
		
		System.out.println(roll_1);
		System.out.println(roll_2);
		System.out.println(roll_3);
		System.out.println(roll_4);
		
		int result = roll_1 + roll_2 + roll_3 + roll_4;
		return result;
		
	}
	
	public static int addOneOfEachDice() {
		
		int roll_1 = threeSidedDie();
		int roll_2 = fourSidedDie();
		int roll_3 = sixSidedDie();
		int roll_4 = eightSidedDie();
		int roll_5 = tenSidedDie();
		
		System.out.println(roll_1);
		System.out.println(roll_2);
		System.out.println(roll_3);
		System.out.println(roll_4);
		System.out.println(roll_5);
		
		int result = roll_1 + roll_2 + roll_3 + roll_4 + roll_5;
		return result;
		
	}
}
