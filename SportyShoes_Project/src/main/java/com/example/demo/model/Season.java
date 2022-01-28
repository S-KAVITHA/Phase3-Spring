package com.example.demo.model;



public enum Season {
	
	 Puma("Puma"), Adidas("Adidas"), Nike("Nike") , Sketchers("Sketchers");

    String brand;

	private Season(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

    
}