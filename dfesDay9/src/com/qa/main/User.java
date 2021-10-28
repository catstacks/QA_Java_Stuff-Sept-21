package com.qa.main;

import java.util.Optional; 

public class User {
	
	
	
	// Fields
		private Integer id;
		private String firstName;
		private String lastName;
		private String email;
		private Long phoneNumber;
		
	//Optional 	
		
	//Optional<integer> phoneNum = Optional.orElse(value1);	
		
	// Constructors	
		public User(Integer id, String firstName, String lastName, String email, Long phoneNumber) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;		
		}
		
	// Getters and Setters	

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getPhoneNumber() throws Exception {
			
			//String a = Longeger.toString(phoneNumber);
			
			//System.out.prLongln(a.orElseThrow(() -> new RuntimeException("Item Not Found")));
			
			//Long phoneNum = phoneNumber;
		return Optional.ofNullable(phoneNumber).orElseThrow(() -> new RuntimeException("Phone number not provided"));
		    
		    //return Optional.ofNullable(this.phoneNumber).map(Object::toString).orElse("Phone number not provided");
			
			//return phoneNumber;
		}

		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		

//Optional
		
//phoneNumber = phoneNumber.map(PhoneNumber ->  "goodbye");
//phoneNumber.ifPresent(PhoneNumber -> System.out.prLongln(PhoneNumber + "found"));
		
// When creating a user, should the 
// phone number not be provided; using 
// an Optional getNumber, please return the
// following: "Phone number not provided".	
		

		
	}

