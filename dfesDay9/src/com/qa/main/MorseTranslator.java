package com.qa.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseTranslator {	
	

	private final Map<String, String> morseTranslator;  

    public MorseTranslator(){
        
    	this.morseTranslator = new HashMap<>();
    	
        this.morseTranslator.put(".-", "a");        
        this.morseTranslator.put("-...", "b");        
        this.morseTranslator.put("-.-.", "c");        
        this.morseTranslator.put("-..", "d");        
        this.morseTranslator.put(".", "e");        
        this.morseTranslator.put("..-.", "f");        
        this.morseTranslator.put("--.", "g");        
        this.morseTranslator.put("....", "h");        
        this.morseTranslator.put("..", "i");        
        this.morseTranslator.put(".---", "j");        
        this.morseTranslator.put("-.-", "k");        
        this.morseTranslator.put(".-..", "l");        
        this.morseTranslator.put("--", "m");                     
        this.morseTranslator.put("---", "o");        
        this.morseTranslator.put(".--.", "p");        
        this.morseTranslator.put("--.-", "q");        
        this.morseTranslator.put(".-.", "r");        
        this.morseTranslator.put("...", "s");                                   	
        this.morseTranslator.put("-","t");        
        this.morseTranslator.put("..-", "u");       
        this.morseTranslator.put("...-", "v");        
        this.morseTranslator.put(".--", "w");        
        this.morseTranslator.put("-..-","x");        
        this.morseTranslator.put("-.--","y");        
        this.morseTranslator.put("--..", "z");
        this.morseTranslator.put("/", " ");
        
    }  
    

//Tutor solution 
    public String translate(String input) { 
    	
    	List<String> storage = new ArrayList<String>();
    	String[] arrInput = input.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for (String e : arrInput) {
    		System.out.println(e);
    		System.out.println(morseTranslator.get(e));
    		sb.append(morseTranslator.get(e));
    	}
        
    	return sb.toString();
     
       
    
    
	}
    
}


