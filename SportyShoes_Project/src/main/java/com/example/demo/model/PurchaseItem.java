package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  


@Entity
@Table(name= "purchase_items")   
public class PurchaseItem { 

	@Id 
	
	@Column(name = "purchase_id")
	private long purchase_id;
	
	@Column(name = "product_id")
	private long productId;

	@Column(name = "user_id")
	private long userId;

	@Column(name = "prod_category")
	private String prodCategory;

	@Column(name = "purchase_date")
	private String purchaseDate;

	
	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "cust_Name")
	private String custName;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private int price;

	
	public PurchaseItem(long purchase_id, long productId, long userId, String prodCategory, String purchaseDate,
			String vendorName, String custName, int quantity, int price) {
		super();
		this.purchase_id = purchase_id;
		this.productId = productId;
		this.userId = userId;
		this.prodCategory = prodCategory;
		this.purchaseDate = purchaseDate;
		this.vendorName = vendorName;
		this.custName = custName;
		this.quantity = quantity;
		this.price = price;
	}

	public PurchaseItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(long purchase_id) {
		this.purchase_id = purchase_id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
