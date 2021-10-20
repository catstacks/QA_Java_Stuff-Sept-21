package com.qa.main;

public class Blackjack {

	public static int cardCount(int playerCard, int houseCard) {
		
	

		if (playerCard <= 20) {
		    return ;
		} else if (playerCard == 21) {
		    return 21;
		} else {
		    return 0;
		}	

	}

}
