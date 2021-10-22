package com.qa.main;

import com.qa.plant.*;

public class Runner {

	public static void main(String[] args) {
		Herbs rosemary = new Herbs("Fully Grown", 32, "Green and slightly prickly", false, false, "Aromatic", false);
		rosemary.sway();
		
//		FlightLessBirds kiwi = new FlightLessBirds("Brown", 3, false, "Forest", 12);
//		kiwi.makeNoise();
//		kiwi.attemptToFly();
//		
//		System.out.println(kiwi.getFeatherColour());

	}

}
