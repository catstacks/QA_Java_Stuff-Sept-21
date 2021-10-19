package com.qa.main;

public class Calculator {

	public static float addMethod(float a, float b) {
		
		float result = a + b;
		return result;
		
	}
	
	public static float subtractMethod(float a, float b) {
		float result = a - b;
		return result;
		
	}
	
	public static float divideMethod(float a, float b) {
		float result = a / b;
		return result;
		
	}
	
	public static float multiplyMethod(float a, float b) {
		float result = a * b;
		return result;
		
	}
	
	public static double powerMethod(double a, double b) {
		double result = (double) Math.pow(a, b);
		return result;
	}
	
}
	
