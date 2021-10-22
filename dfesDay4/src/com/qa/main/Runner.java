package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		

				Plant housePlant = new Plant();
				System.out.println(housePlant.lifeStage);
				System.out.println(housePlant.height);
				System.out.println(housePlant.leaves);
				System.out.println(housePlant.hasBugTenants);
				housePlant.photosynthesise();
				
//				FlightLessBirds kiwi = new FlightLessBirds("Brown", 3, false, "Forest", 12);
//				kiwi.makeNoise();
//				kiwi.attemptToFly();
//				
//				System.out.println(kiwi.getFeatherColour());

	}

}
