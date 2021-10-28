package com.qa.main;


public class Runner {

	public static void main(String[] args) throws Exception {
		
// Optional<Long> phoneNumber = Optional.of(null);
		
//		MorseTranslator translator = new MorseTranslator();
//        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		
		//System.out.println(item.get());
		
		User barry = new User(23, "Barry", "Hess", "bh@com", null);
		
		System.out.println(barry.getPhoneNumber());
		
		


	}

}
