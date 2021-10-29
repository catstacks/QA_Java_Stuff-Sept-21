package com.qa.main;

public class Card {

	//fields
	private Suit suit;
	private Rank cardValue;
	
	
	//constructor
	public Card (Rank cardValue, Suit suit) {
	  this.cardValue = cardValue;
	  this.suit = suit;
	  }

	
	//getters and setters
	public Suit getSuit() {
		return suit;
	  }
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	  }
	
	public Rank getCardValue() {
		return cardValue;
	  }
	
	public void setCardValue(Rank cardValue) {
		this.cardValue = cardValue;
	  }
	  
	@Override    
	public String toString() {
		return "The card drawn is a/an " + cardValue + " of " + suit;
	 }

	
	
	
}
	
	



