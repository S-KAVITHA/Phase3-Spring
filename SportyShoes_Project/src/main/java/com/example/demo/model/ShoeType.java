package com.example.demo.model;



public enum ShoeType {
	
	 Male("Male"), Female("Female"), Both("Both") ;

   private String name;


	private ShoeType(String name) {
	this.name = name;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

    
}