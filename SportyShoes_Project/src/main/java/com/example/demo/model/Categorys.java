package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ecategory")
public class Categorys {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_Id")
	private String category_Id;

	@Column(name = "name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL ,mappedBy = "category")
	private Product product;

	
	public Categorys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorys(String category_Id, String name, Product product) {
		super();
		this.category_Id = category_Id;
		this.name = name;
		this.product = product;
	}

	public String getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(String category_Id) {
		this.category_Id = category_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
