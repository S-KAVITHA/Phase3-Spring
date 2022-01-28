package com.example.demo.controller;



public enum Brand {
	
	 Puma("Puma"), Adidas("Adidas"), Nike("Nike") , Sketchers("Sketchers");

    String brand;

	private Brand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

    
}