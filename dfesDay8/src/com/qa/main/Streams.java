package com.qa.main;

import java.util.Arrays;
import java.util.List;


public class Streams {

	public static void main(String[] args) {
		
	// Exercise 1
		
	    List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
	    
//	  		names.stream()
//	    		.filter(str -> !str.startsWith("J"))	    		
//	            .forEach(x -> System.out.println("Hello " + x));
//	  		System.out.println("James");
	    	
//	   List<String> result =
//	    		names.stream().filter(str -> !str.startsWith("J")).collect(Collectors.toList());
//	    		result.stream().forEach(n -> System.out.println("hello " + n));
	    
	    // Clare's solution below	  		
//	  		
//	  	List<String> result =
//			names.stream().filter(str -> !str.startsWith("J")).collect(Collectors.toList());
//			List<String> result2 =
//			result.stream().map(str -> "Hello " + str).collect(Collectors.toList());
//
//			result2.add(2, "James");
//
//			result2.stream().forEach(n -> System.out.println(n));
	  				
	  	//Exercise 2			
	  				
			List<Integer> number = Arrays.asList(3,4,7,8,12);
		    int products = 
		        number.stream()
		            .reduce((a,b) -> a*b)
		            .get();
		    	
		    System.out.println(products);
	  				
	}  	

}
