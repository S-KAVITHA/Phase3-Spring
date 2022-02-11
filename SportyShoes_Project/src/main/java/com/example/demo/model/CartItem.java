package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * This is NOT a Hibernate class or a table class. This is a POJO which is used internally within the app
 * @author oem
 *
 */
@Entity
public class CartItem { 

	@Id 
	private String Id ;
	private long productId;
	private String name;
	private Float price;
	private Float subTotal ;
	private int qty;
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(String Id, long productId, String name, Float get_prodPrice) {
		super();
		this.Id = Id;
		this.productId = productId;
		this.name = name;
		this.price = get_prodPrice;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}

	public long getProductId() {return this.productId; }  
	public String getName() { return this.name;} 
	public Float getPrice() { return this.price;} 
	public Float getRate() { return this.subTotal;} 
	public int getQty() { return this.qty;} 

	
	public void setProductId(long id) { this.productId= id;}
	public void setName(String value) { this.name = value;}
	public void setPrice(Float value) { this.price = value;}
	public void setRate(Float value) { this.subTotal = value;}
	public void setQty(int value) { this.qty = value;}

	@Override
	public String toString() {
		return "CartItem [Id=" + Id + ", productId=" + productId + ", name=" + name + ", price=" + price + ", subTotal="
				+ subTotal + ", qty=" + qty + "]";
	}
	
}
