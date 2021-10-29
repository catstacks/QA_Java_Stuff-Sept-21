package com.qa.main;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
import java.util.Random;

public class Dealer {
	
	public Card dealCard() {
		return new Card(Rank.values()[new Random().nextInt(Rank.values().length)], 
				Suit.values()[new Random().nextInt(Suit.values().length)]);
				
	}
	
//	private ArrayList deck;
//
//	  public Dealer () {
//	    this.deck = new ArrayList();
//	    
//	    for (int i=0; i<13; i++) {
//	    	
//	      Rank value = Rank.values()[i];
//
//	      for (int j=0; j<4; j++) {
//	        Card card = new Card(value, Suit.values()[j]);
//	        this.deck.add(card);
//	      }
//	    }
//
//	    Collections.shuffle(deck);
//
//	    Iterator cardIterator = deck.iterator();
//	    while (cardIterator.hasNext()) {
//	      Card drawCard = cardIterator.next();
//	      
//	      System.out.println(drawCard.getCardValue() + " of " + drawCard.getSuit());
//	    }
//	  }


}
