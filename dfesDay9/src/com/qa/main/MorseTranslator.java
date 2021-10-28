package com.qa.main;

import java.util.*;

public class MorseTranslator {
	
	public static void main(String[] args) {

    Map<String, String> morseTranslator  = new HashMap<>();

    //public MorseTranslator(){
        
        morseTranslator.put(".-", "a");
        
        morseTranslator.put("-...", "b");
        
        morseTranslator.put("-.-.", "c");
        
        morseTranslator.put("-..", "d");
        
        morseTranslator.put(".", "e");
        
        morseTranslator.put("..-.", "f");
        
        morseTranslator.put("--.", "g");
        
        morseTranslator.put("....", "h");
        
        morseTranslator.put("..", "i");
        
        morseTranslator.put(".---", "j");
        
        morseTranslator.put("-.-", "k");
        
        morseTranslator.put(".-..", "l");
        
        morseTranslator.put("--", "m");
                     
        morseTranslator.put("---", "o");
        
        morseTranslator.put(".--.", "p");
        
        morseTranslator.put("--.-", "q");
        
        morseTranslator.put(".-.", "r");
        
        morseTranslator.put("...", "s");    
                                   	
        morseTranslator.put("-","t");
        
        morseTranslator.put("..-", "u");
        
        morseTranslator.put("...-", "v");
        
        morseTranslator.put(".--", "w");
        
        morseTranslator.put("-..-","x");
        
        morseTranslator.put("-.--","y");
        
        morseTranslator.put("--..", "z");

        morseTranslator.put("/", " ");
        
        //morseTranslator.forEach(x, i) -> System.out.println(x + " " + i));
    }

}
