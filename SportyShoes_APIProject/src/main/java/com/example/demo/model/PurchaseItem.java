package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  


@Entity
@Table(name= "purchase_items")   
public class PurchaseItem { 

	@Id 
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchase_id")
	private int purchaseId;
	
	@Column(name = "product_id")
	private int productId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "prod_category")
	private int prodCategory;

	@Column(name = "purchase_date")
	private String purchaseDate;

	
	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "cust_Name")
	private String custName;

	@Column(name = "quantity")
	private int quantity;

	public PurchaseItem(int purchaseId, int productId, int userId, int prodCategory, String purchaseDate,
			String vendorName, String custName, int quantity) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.userId = userId;
		this.prodCategory = prodCategory;
		this.purchaseDate = purchaseDate;
		this.vendorName = vendorName;
		this.custName = custName;
		this.quantity = quantity;
	}

	public PurchaseItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(int prodCategory) {
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

	@Override
	public String toString() {
		return "PurchaseItem [purchaseId=" + purchaseId + ", productId=" + productId + ", userId=" + userId
				+ ", prodCategory=" + prodCategory + ", purchaseDate=" + purchaseDate + ", vendorName=" + vendorName
				+ ", custName=" + custName + ", quantity=" + quantity + "]";
	}

}
