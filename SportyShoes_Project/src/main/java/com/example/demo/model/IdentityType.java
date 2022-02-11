package com.example.demo.model;



public enum IdentityType {
	
	Aadhar_card("Aadhar_card"), SSN("SSN"), Passport("Passport"),Voter_ID("Voter_ID"),Driving_license("Driving_license") ;

   private String name;


	private IdentityType(String name) {
	this.name = name;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	    
}