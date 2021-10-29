package com.qa.main;

import java.util.Scanner;
import java.util.;

public class Exception {
	
	Scanner calc = new Scanner(System.in);
	
	 try {
         System.out.print("Enter the first number: ");
         Float a = calc.nextFloat();           

         System.out.print("Enter the second number: ");
         Float b = calc.nextFloat();
         // this part of decision, it doesn't work.
         if (b != 0) {
             System.out.println("Your result is " + (a / b));
      
         } else if (a < b) {
         	throw new LargerDenominator("Your entries are not valid, please try again.");
         } else {
             System.out.println("Your answer is not valid");
         } }
	 
     catch (ArithmeticException e) {
    	 e.printStackTrace();
         System.out.println("You cannot divide by zero");     
         	    		
     }
	 return 0;
	 
	 }

}


//public static int calcDiv(int num1, int num2) {
//    int result = 0; // creates result object
//    try { // will try and do the block
//        // if checks if 1 greater than 2 = throw error
//        if (num1 < num2) {
//            throw new CustomException("Please ensure the first number is greater than the second!");
//        }
//        result = num1 / num2; // if the if statement doesn't apply result = divide
//    }
//    catch (ArithmeticException e) {
//        e.printStackTrace(); //
//        System.out.println("Please don't Divide by Zero");
//    } catch (CustomException e) {
//        e.printStackTrace();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return result;
//}