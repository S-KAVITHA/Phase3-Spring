package com.example.demo.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name= "eproduct")   
public class Product { 


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private long productId;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_Id")
	private Categorys category;  
	
	@Enumerated(EnumType.STRING)
	private Season season;  
	
	@Enumerated(EnumType.STRING)
	private ShoeType shoetype;  
	
	@Column(name = "price")
	private float price;
	
	@Enumerated(EnumType.STRING)
	private Color color;  
	
	@Column(name = "createdDate")
	private Date createdDate;  

	
	@Column(name = "discount")
	private int discount;  
	
	@Column(name = "quantity")
	private int quantity;
	
	
	public enum ShoeType {

		Monday,Tuesday
		
	}
	
	public enum Color {

	    Blue, Black, White , Brown
	}
	
	
	/*
	 * public enum Season {
	 * 
	 * Winter, Summer, Rainy
	 * 
	 * }
	 */

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}





	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Categorys getCategory() {
		return category;
	}


	public void setCategory(Categorys category) {
		this.category = category;
	}


	public Season getSeason() {
		return season;
	}


	public void setSeason(Season season) {
		this.season = season;
	}


	



	public Product(long productId, String name, Categorys category, Season season, ShoeType shoetype, float price,
			Color color, Date createdDate, int discount, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.season = season;
		this.shoetype = shoetype;
		this.price = price;
		this.color = color;
		this.createdDate = createdDate;
		this.discount = discount;
		this.quantity = quantity;
	}





	public ShoeType getShoetype() {
		return shoetype;
	}





	public void setShoetype(ShoeType shoetype) {
		this.shoetype = shoetype;
	}





	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
