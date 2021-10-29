package com.qa.main;

import java.util.Scanner;

public class Calculator {
	
public static float divideMethod; { 		
		
		Scanner calc = new Scanner(System.in);
      
        
        Float a;
        Float b;
        Float result;
        
        System.out.println("Enter the first number: ");
        a = calc.nextFloat();
        
        System.out.println("Enter the second number:" );
        b = calc.nextFloat();
          
//		Float user = calc.nextFloat(a, b);
		
		result = a / b;	

        
        
        //float result = a / b;
        		
    		//return result;
        
   


		
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
		 
	        catch (e) {
	            System.out.println("You cannot divide by zero");     
	            	    		
	    	} 
		 }

	}


