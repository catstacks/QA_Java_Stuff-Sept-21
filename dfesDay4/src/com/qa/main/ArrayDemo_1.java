package com.qa.main;

public class ArrayDemo_1 {

	public static void squareNum() {
		int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]*2);		
		}
		
		for(int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]*numList[i]);		
		}
		
		
		int[] plainNumList = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < plainNumList.length; i++) {
		
	
		plainNumList[i] = numList[i];
		
		System.out.println(plainNumList[i]);
				
		}
	}	
}	