package com.example.demo.model;

import java.util.Date;
import java.util.List;



public class Categorys {




	private int category_Id;


	private String name;


	
	public Categorys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorys(int id, String name) {
		super();
		this.category_Id = id;
		this.name = name;
		
	}

	public int getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(int category_Id) {
		this.category_Id = (int) category_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
