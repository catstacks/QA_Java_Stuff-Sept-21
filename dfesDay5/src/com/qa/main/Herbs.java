package com.qa.main;

public class Herbs extends Plants {
	
	
		
		// Fields 
		private String flavour; 
		private boolean isPoisonous;
		
		// Method
		public void glimmer() {
			System.out.println("I fill you with hope because I taste good.");
		}
		
		@Override // Good practice to let developers know you are overriding a method
		public void sway() {
			System.out.println("Each leaf is gently swaying...");
		}

		// Getters and Setters
		public String getflavour() {
			return flavour;
		}

		public void setflavour(String flavour) {
			this.flavour = flavour;
		}

		public boolean getisPoisonous() {
			return isPoisonous;
		}

		public void setisPoisonous(boolean isPoisonous) {
			this.isPoisonous = isPoisonous;
		}

		public Herbs(String lifeStage, int height, String leaves, boolean hasFruit, boolean hasBugTenants, String flavour, boolean isPoisonous) {
			super(lifeStage, height, leaves, hasFruit, hasBugTenants);
			this.flavour = flavour;
			this.isPoisonous = isPoisonous;
		}
		
		
		
		

	}


